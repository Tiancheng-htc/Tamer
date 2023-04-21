### In our tool, we code the AST node into integers as the following way.



```
string2char.put("UnknownType", 0);
string2char.put("CompilationUnit", 1);
string2char.put("ClassOrInterfaceDeclaration", 2);
string2char.put("MethodDeclaration", 3);
string2char.put("ConstructorDeclaration", 4);
string2char.put("Parameter", 5);
string2char.put("ClassOrInterfaceType", 6);
string2char.put("BlockStmt", 7);
string2char.put("ExpressionStmt", 8);
string2char.put("IfStmt", 9);
string2char.put("ReturnStmt", 10);
string2char.put("VariableDeclarationExpr", 11);
string2char.put("UnaryExpr", 12);
string2char.put("BinaryExpr", 13);
string2char.put("NameExpr", 14);
string2char.put("VariableDeclarator", 15);
string2char.put("InstanceOfExpr", 16);
string2char.put("SwitchStmt", 17);
string2char.put("AssignExpr", 18);
string2char.put("MethodCallExpr", 19);
string2char.put("FieldAccessExpr", 20);
string2char.put("SwitchEntry", 21);
string2char.put("EnclosedExpr", 22);
string2char.put("CastExpr", 23);
string2char.put("ObjectCreationExpr", 24);
string2char.put("TypeParameter", 25);
string2char.put("ArrayType", 26);
string2char.put("TryStmt", 27);
string2char.put("ForEachStmt", 28);
string2char.put("CatchClause", 29);
string2char.put("WildcardType", 30);
string2char.put("MarkerAnnotationExpr", 31);
string2char.put("ArrayCreationExpr", 32);
string2char.put("WhileStmt", 33);
string2char.put("ThrowStmt", 34);
string2char.put("ArrayCreationLevel", 35);
string2char.put("ForStmt", 36);
string2char.put("ArrayAccessExpr", 37);
string2char.put("ClassExpr", 38);
string2char.put("DoStmt", 39);
string2char.put("ArrayInitializerExpr", 40);
string2char.put("ExplicitConstructorInvocationStmt", 41);
string2char.put("ConditionalExpr", 42);
string2char.put("SingleMemberAnnotationExpr", 43);
string2char.put("FieldDeclaration", 44);
string2char.put("SynchronizedStmt", 45);
string2char.put("AssertStmt", 46);
string2char.put("InitializerDeclaration", 47);
string2char.put("ThisExpr", 48);
string2char.put("LabeledStmt", 49);
string2char.put("BreakStmt", 50);
string2char.put("ContinueStmt", 51);
string2char.put("LocalClassDeclarationStmt", 52);
string2char.put("SuperExpr", 53);
string2char.put("NormalAnnotationExpr", 54);
string2char.put("MemberValuePair", 55);
string2char.put("Name", 56);
string2char.put("LambdaExpr", 57);
string2char.put("SimpleName", 58);
string2char.put("Modifier", 59);
string2char.put("PrimitiveType", 60);
string2char.put("IntegerLiteralExpr", 61);
string2char.put("NullLiteralExpr", 62);
string2char.put("VoidType", 63);
string2char.put("StringLiteralExpr", 64);
string2char.put("BooleanLiteralExpr", 65);
string2char.put("DoubleLiteralExpr", 66);
string2char.put("CharLiteralExpr", 67);
string2char.put("LongLiteralExpr", 68);
string2char.put("EmptyStmt", 69);
```