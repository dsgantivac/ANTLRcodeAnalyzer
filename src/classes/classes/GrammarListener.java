// Generated from Grammar.g4 by ANTLR 4.7.1
package classes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(GrammarParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(GrammarParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(GrammarParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(GrammarParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(GrammarParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(GrammarParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(GrammarParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(GrammarParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(GrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(GrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(GrammarParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(GrammarParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(GrammarParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(GrammarParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(GrammarParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(GrammarParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(GrammarParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(GrammarParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(GrammarParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(GrammarParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(GrammarParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(GrammarParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(GrammarParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(GrammarParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(GrammarParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(GrammarParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(GrammarParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(GrammarParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(GrammarParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(GrammarParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(GrammarParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(GrammarParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(GrammarParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(GrammarParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(GrammarParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(GrammarParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(GrammarParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(GrammarParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(GrammarParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(GrammarParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(GrammarParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(GrammarParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(GrammarParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(GrammarParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(GrammarParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(GrammarParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(GrammarParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(GrammarParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(GrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(GrammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(GrammarParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(GrammarParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(GrammarParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(GrammarParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(GrammarParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(GrammarParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(GrammarParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(GrammarParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(GrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(GrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(GrammarParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(GrammarParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(GrammarParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(GrammarParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(GrammarParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(GrammarParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(GrammarParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(GrammarParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(GrammarParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(GrammarParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(GrammarParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(GrammarParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(GrammarParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(GrammarParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(GrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(GrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(GrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(GrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(GrammarParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(GrammarParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(GrammarParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(GrammarParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(GrammarParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(GrammarParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(GrammarParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(GrammarParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(GrammarParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(GrammarParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(GrammarParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(GrammarParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(GrammarParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(GrammarParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(GrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(GrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(GrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(GrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(GrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(GrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(GrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(GrammarParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(GrammarParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(GrammarParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(GrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(GrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(GrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(GrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(GrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(GrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(GrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(GrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(GrammarParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(GrammarParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(GrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(GrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(GrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(GrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(GrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(GrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(GrammarParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(GrammarParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(GrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(GrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(GrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(GrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(GrammarParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(GrammarParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(GrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(GrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(GrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(GrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(GrammarParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(GrammarParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(GrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(GrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(GrammarParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(GrammarParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(GrammarParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(GrammarParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(GrammarParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(GrammarParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(GrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(GrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(GrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(GrammarParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(GrammarParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(GrammarParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(GrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(GrammarParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(GrammarParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(GrammarParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(GrammarParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(GrammarParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(GrammarParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(GrammarParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(GrammarParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(GrammarParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(GrammarParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(GrammarParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(GrammarParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(GrammarParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(GrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(GrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(GrammarParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(GrammarParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(GrammarParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(GrammarParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(GrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(GrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(GrammarParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(GrammarParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(GrammarParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(GrammarParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(GrammarParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(GrammarParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(GrammarParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(GrammarParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(GrammarParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(GrammarParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(GrammarParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(GrammarParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(GrammarParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(GrammarParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(GrammarParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(GrammarParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(GrammarParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(GrammarParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(GrammarParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(GrammarParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(GrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(GrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(GrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(GrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(GrammarParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(GrammarParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(GrammarParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(GrammarParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(GrammarParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(GrammarParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(GrammarParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(GrammarParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(GrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(GrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(GrammarParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(GrammarParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(GrammarParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(GrammarParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(GrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(GrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(GrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(GrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(GrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(GrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(GrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(GrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(GrammarParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(GrammarParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(GrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(GrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(GrammarParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(GrammarParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(GrammarParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(GrammarParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(GrammarParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(GrammarParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(GrammarParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(GrammarParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(GrammarParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(GrammarParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(GrammarParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(GrammarParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(GrammarParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(GrammarParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(GrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(GrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(GrammarParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(GrammarParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(GrammarParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(GrammarParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(GrammarParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(GrammarParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(GrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(GrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(GrammarParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(GrammarParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(GrammarParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(GrammarParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(GrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(GrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(GrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(GrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(GrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(GrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(GrammarParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(GrammarParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(GrammarParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(GrammarParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(GrammarParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(GrammarParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(GrammarParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(GrammarParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(GrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(GrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(GrammarParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(GrammarParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(GrammarParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(GrammarParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(GrammarParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(GrammarParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(GrammarParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(GrammarParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(GrammarParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(GrammarParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(GrammarParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(GrammarParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(GrammarParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(GrammarParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(GrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(GrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(GrammarParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(GrammarParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(GrammarParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(GrammarParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(GrammarParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(GrammarParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(GrammarParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(GrammarParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(GrammarParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(GrammarParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(GrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(GrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(GrammarParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(GrammarParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(GrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(GrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(GrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(GrammarParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(GrammarParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(GrammarParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(GrammarParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(GrammarParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(GrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(GrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(GrammarParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(GrammarParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(GrammarParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(GrammarParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(GrammarParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(GrammarParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(GrammarParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(GrammarParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(GrammarParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(GrammarParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(GrammarParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(GrammarParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(GrammarParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(GrammarParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(GrammarParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(GrammarParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(GrammarParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(GrammarParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(GrammarParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(GrammarParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(GrammarParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(GrammarParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(GrammarParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(GrammarParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(GrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(GrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(GrammarParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(GrammarParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(GrammarParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(GrammarParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(GrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(GrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(GrammarParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(GrammarParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(GrammarParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(GrammarParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(GrammarParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(GrammarParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(GrammarParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(GrammarParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(GrammarParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(GrammarParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(GrammarParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(GrammarParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(GrammarParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(GrammarParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(GrammarParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(GrammarParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(GrammarParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(GrammarParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(GrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(GrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(GrammarParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(GrammarParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(GrammarParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(GrammarParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(GrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(GrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(GrammarParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(GrammarParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(GrammarParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(GrammarParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(GrammarParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(GrammarParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(GrammarParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(GrammarParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(GrammarParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(GrammarParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(GrammarParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(GrammarParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(GrammarParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(GrammarParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(GrammarParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(GrammarParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(GrammarParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(GrammarParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(GrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(GrammarParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(GrammarParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(GrammarParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(GrammarParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(GrammarParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(GrammarParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(GrammarParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(GrammarParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(GrammarParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(GrammarParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(GrammarParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(GrammarParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(GrammarParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(GrammarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(GrammarParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(GrammarParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(GrammarParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(GrammarParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(GrammarParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(GrammarParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(GrammarParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(GrammarParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(GrammarParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(GrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(GrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(GrammarParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(GrammarParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(GrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(GrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(GrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(GrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(GrammarParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(GrammarParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(GrammarParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(GrammarParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(GrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(GrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(GrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(GrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(GrammarParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(GrammarParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(GrammarParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(GrammarParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(GrammarParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(GrammarParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(GrammarParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(GrammarParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(GrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(GrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(GrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(GrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(GrammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(GrammarParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(GrammarParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(GrammarParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(GrammarParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(GrammarParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(GrammarParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(GrammarParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(GrammarParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(GrammarParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(GrammarParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(GrammarParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(GrammarParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(GrammarParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(GrammarParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(GrammarParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(GrammarParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(GrammarParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(GrammarParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(GrammarParser.CastExpressionContext ctx);
}