    @Test
    public void testAclResponse() throws Exception {
        String[] responses = new String[] { "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<d:multistatus xmlns:d=\"DAV:\">" + " <d:response>" + "  <d:href>/webdavtest/</d:href>" + "  <d:propstat>" + "   <d:prop>" + "       <d:owner>" + "          <d:href>http://www.example.com/acl/users/gstein</d:href>" + "       </d:owner>" + "    <d:group><d:href>/group/somegroup</d:href></d:group>" + "<d:acl>" + "  <d:ace>" + "    <d:principal>" + "      <d:property><d:owner/></d:property>" + "    </d:principal>" + "    <d:grant>" + "      <d:privilege><d:read/></d:privilege>" + "      <d:privilege><d:write/></d:privilege>" + "      <d:privilege><d:write-properties/></d:privilege>" + "      <d:privilege><d:write-content/></d:privilege>" + "      <d:privilege><d:unlock/></d:privilege>" + "      <d:privilege><d:read-acl/></d:privilege>" + "      <d:privilege><d:bind/></d:privilege>" + "      <d:privilege><d:unbind/></d:privilege>" + "      <d:privilege><d:all/></d:privilege>" + "    </d:grant>" + "    <d:inherited><d:href>/</d:href></d:inherited>" + "  </d:ace>" + "  <d:ace>" + "    <d:principal>" + "      <d:property><d:owner/></d:property>" + "    </d:principal>" + "    <d:deny>" + "      <d:privilege><d:all/></d:privilege>" + "    </d:deny>" + "  </d:ace>" + "  <d:ace>" + "    <d:principal>" + "      <d:property><d:group/></d:property>" + "    </d:principal>" + "    <d:grant>" + "      <d:privilege><d:read/></d:privilege>" + "      <d:privilege><d:write/></d:privilege>" + "      <d:privilege><d:read/></d:privilege>" + "    </d:grant>" + "  </d:ace>" + "  <d:ace>" + "    <d:principal>" + "      <d:href>/some/user</d:href>" + "    </d:principal>" + "    <d:deny>" + "      <d:privilege><d:all/></d:privilege>" + "    </d:deny>" + "  </d:ace>" + "  <d:ace>" + "    <d:protected/>" + "    <d:principal><d:all/></d:principal>" + "    <d:grant>" + "      <d:privilege><d:read/></d:privilege>" + "    </d:grant>" + "  </d:ace>" + "</d:acl> " + "   </d:prop>" + "   <d:status>HTTP/1.1 200 OK</d:status>" + "  </d:propstat>" + " </d:response>" + "</d:multistatus>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<d:multistatus xmlns:d=\"DAV:\">" + " <d:response>" + "  <d:href>/webdavtest/</d:href>" + "  <d:propstat>" + "   <d:prop>" + "    <d:owner><d:unauthenticated/></d:owner>" + "    <d:group><d:href>/group/somegroup</d:href></d:group>" + "<d:acl>" + "  <d:ace>" + "    <d:principal>" + "      <d:property><d:owner/></d:property>" + "    </d:principal>" + "    <d:grant>" + "      <d:privilege><d:read/></d:privilege>" + "      <d:privilege><d:write/></d:privilege>" + "      <d:privilege><d:write-properties/></d:privilege>" + "      <d:privilege><d:write-content/></d:privilege>" + "      <d:privilege><d:unlock/></d:privilege>" + "      <d:privilege><d:read-acl/></d:privilege>" + "      <d:privilege><d:bind/></d:privilege>" + "      <d:privilege><d:unbind/></d:privilege>" + "      <d:privilege><d:all/></d:privilege>" + "    </d:grant>" + "    <d:inherited><d:href>/</d:href></d:inherited>" + "  </d:ace>" + "  <d:ace>" + "    <d:principal>" + "      <d:property><d:owner/></d:property>" + "    </d:principal>" + "    <d:deny>" + "      <d:privilege><d:all/></d:privilege>" + "    </d:deny>" + "  </d:ace>" + "  <d:ace>" + "    <d:principal>" + "      <d:property><d:group/></d:property>" + "    </d:principal>" + "    <d:grant>" + "      <d:privilege><d:read/></d:privilege>" + "      <d:privilege><d:write/></d:privilege>" + "    </d:grant>" + "  </d:ace>" + "  <d:ace>" + "    <d:principal>" + "      <d:href>/some/user</d:href>" + "    </d:principal>" + "    <d:deny>" + "      <d:privilege><d:all/></d:privilege>" + "    </d:deny>" + "  </d:ace>" + "  <d:ace>" + "    <d:protected/>" + "    <d:principal><d:all/></d:principal>" + "    <d:grant>" + "      <d:privilege><d:read/></d:privilege>" + "    </d:grant>" + "  </d:ace>" + "</d:acl> " + "   </d:prop>" + "   <d:status>HTTP/1.1 200 OK</d:status>" + "  </d:propstat>" + " </d:response>" + "</d:multistatus>" };
        for (String response : responses) {
            MultiStatusResponseHandler handler = new MultiStatusResponseHandler();
            Multistatus status = handler.getMultistatus(new ByteArrayInputStream(response.getBytes()));
            assertNotNull(status);
            assertEquals(1, status.getResponse().size());
            Response r = status.getResponse().get(0);
            assertNotNull(r.getPropstat());
            assertFalse(r.getPropstat().isEmpty());
            DavAcl davAcl = new DavAcl(r);
            assertNotNull("Query should give a owner name " + response, davAcl.getOwner());
            assertEquals("Query should give us group name", "/group/somegroup", davAcl.getGroup());
            assertNotNull("Query should result in an existing ACL", davAcl.getAces());
            assertEquals(5, davAcl.getAces().size());
            assertEquals("read", davAcl.getAces().get(0).getGranted().get(0));
            assertEquals("write", davAcl.getAces().get(0).getGranted().get(1));
            assertEquals("write-properties", davAcl.getAces().get(0).getGranted().get(2));
            assertEquals("all", davAcl.getAces().get(1).getDenied().get(0));
            assertEquals(DavPrincipal.PrincipalType.PROPERTY, davAcl.getAces().get(0).getPrincipal().getPrincipalType());
            assertEquals(new QName("DAV:", "owner"), davAcl.getAces().get(0).getPrincipal().getProperty());
            assertEquals(DavPrincipal.PrincipalType.HREF, davAcl.getAces().get(3).getPrincipal().getPrincipalType());
            assertEquals("/some/user", davAcl.getAces().get(3).getPrincipal().getValue());
            assertEquals(DavPrincipal.PrincipalType.KEY, davAcl.getAces().get(4).getPrincipal().getPrincipalType());
            assertEquals("all", davAcl.getAces().get(4).getPrincipal().getValue());
            assertEquals("/", davAcl.getAces().get(0).getInherited());
            assertTrue(davAcl.getAces().get(4).isProtected());
        }
    }