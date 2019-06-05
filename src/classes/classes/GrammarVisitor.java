// Generated from Grammar.g4 by ANTLR 4.7.1
package classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(GrammarParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(GrammarParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(GrammarParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(GrammarParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(GrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(GrammarParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(GrammarParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(GrammarParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(GrammarParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(GrammarParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(GrammarParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(GrammarParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(GrammarParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(GrammarParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(GrammarParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(GrammarParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(GrammarParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(GrammarParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(GrammarParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(GrammarParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(GrammarParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(GrammarParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(GrammarParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(GrammarParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(GrammarParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(GrammarParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(GrammarParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(GrammarParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(GrammarParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(GrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(GrammarParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(GrammarParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(GrammarParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(GrammarParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(GrammarParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(GrammarParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(GrammarParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(GrammarParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(GrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(GrammarParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(GrammarParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(GrammarParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(GrammarParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(GrammarParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(GrammarParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(GrammarParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(GrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(GrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(GrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(GrammarParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(GrammarParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(GrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(GrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(GrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(GrammarParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(GrammarParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(GrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(GrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(GrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(GrammarParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(GrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(GrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(GrammarParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(GrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(GrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(GrammarParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(GrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(GrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(GrammarParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(GrammarParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(GrammarParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(GrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(GrammarParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(GrammarParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(GrammarParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(GrammarParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(GrammarParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(GrammarParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(GrammarParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(GrammarParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(GrammarParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(GrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(GrammarParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(GrammarParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(GrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(GrammarParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(GrammarParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(GrammarParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(GrammarParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(GrammarParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(GrammarParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(GrammarParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(GrammarParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(GrammarParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(GrammarParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(GrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(GrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(GrammarParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(GrammarParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(GrammarParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(GrammarParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(GrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(GrammarParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(GrammarParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(GrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(GrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(GrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(GrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(GrammarParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(GrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(GrammarParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(GrammarParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(GrammarParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(GrammarParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(GrammarParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(GrammarParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(GrammarParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(GrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(GrammarParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(GrammarParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(GrammarParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(GrammarParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(GrammarParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(GrammarParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(GrammarParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(GrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(GrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(GrammarParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(GrammarParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(GrammarParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(GrammarParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(GrammarParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(GrammarParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(GrammarParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(GrammarParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(GrammarParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(GrammarParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(GrammarParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(GrammarParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(GrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(GrammarParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(GrammarParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(GrammarParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(GrammarParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(GrammarParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(GrammarParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(GrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(GrammarParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(GrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(GrammarParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(GrammarParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(GrammarParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(GrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(GrammarParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(GrammarParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(GrammarParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(GrammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(GrammarParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(GrammarParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(GrammarParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(GrammarParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(GrammarParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(GrammarParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(GrammarParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(GrammarParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(GrammarParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(GrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(GrammarParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(GrammarParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(GrammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(GrammarParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(GrammarParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(GrammarParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(GrammarParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(GrammarParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(GrammarParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(GrammarParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(GrammarParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(GrammarParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(GrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(GrammarParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(GrammarParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(GrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(GrammarParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(GrammarParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(GrammarParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(GrammarParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(GrammarParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(GrammarParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(GrammarParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(GrammarParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(GrammarParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(GrammarParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(GrammarParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(GrammarParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(GrammarParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(GrammarParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(GrammarParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(GrammarParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(GrammarParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(GrammarParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(GrammarParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(GrammarParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(GrammarParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(GrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(GrammarParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(GrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(GrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(GrammarParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(GrammarParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(GrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(GrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(GrammarParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(GrammarParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(GrammarParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(GrammarParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(GrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(GrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(GrammarParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(GrammarParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(GrammarParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(GrammarParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(GrammarParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(GrammarParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(GrammarParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(GrammarParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(GrammarParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(GrammarParser.CastExpressionContext ctx);
}