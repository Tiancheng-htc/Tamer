package com.mindquarry.auth;

/**
 * Add summary documentation here.
 *
 * @author 
 * <a href="mailto:bastian.steinert(at)mindquarry.com">Bastian Steinert</a>
 */
public interface RightRO {

    String getOperation();

    ResourceRO getResource();
}