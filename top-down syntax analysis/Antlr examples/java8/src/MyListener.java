import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


import java.io.File;
import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;



public class MyListener implements java8Listener{
    private List<String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public void enterMethodDeclarator(java8Parser.MethodDeclaratorContext ctx) {
        TerminalNode node = ctx.Identifier();
        String methodName = node.getText();

        if (Character.isUpperCase(methodName.charAt(0))) {
            String error = String.format("Method %s is uppercased!", methodName);
            errors.add(error);
        } else {
            String error = String.format("Method %s is lowercased!", methodName);
            errors.add(error);
        }
    }

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLiteral(java8Parser.LiteralContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLiteral(java8Parser.LiteralContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimitiveType(java8Parser.PrimitiveTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimitiveType(java8Parser.PrimitiveTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNumericType(java8Parser.NumericTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNumericType(java8Parser.NumericTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIntegralType(java8Parser.IntegralTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIntegralType(java8Parser.IntegralTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFloatingPointType(java8Parser.FloatingPointTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFloatingPointType(java8Parser.FloatingPointTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterReferenceType(java8Parser.ReferenceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitReferenceType(java8Parser.ReferenceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassOrInterfaceType(java8Parser.ClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassOrInterfaceType(java8Parser.ClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassType(java8Parser.ClassTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassType(java8Parser.ClassTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassType_lf_classOrInterfaceType(java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassType_lf_classOrInterfaceType(java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassType_lfno_classOrInterfaceType(java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassType_lfno_classOrInterfaceType(java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceType(java8Parser.InterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceType(java8Parser.InterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceType_lf_classOrInterfaceType(java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceType_lf_classOrInterfaceType(java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceType_lfno_classOrInterfaceType(java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceType_lfno_classOrInterfaceType(java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeVariable(java8Parser.TypeVariableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeVariable(java8Parser.TypeVariableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArrayType(java8Parser.ArrayTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayType(java8Parser.ArrayTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDims(java8Parser.DimsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDims(java8Parser.DimsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeParameter(java8Parser.TypeParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeParameter(java8Parser.TypeParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeParameterModifier(java8Parser.TypeParameterModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeParameterModifier(java8Parser.TypeParameterModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeBound(java8Parser.TypeBoundContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeBound(java8Parser.TypeBoundContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAdditionalBound(java8Parser.AdditionalBoundContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAdditionalBound(java8Parser.AdditionalBoundContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeArguments(java8Parser.TypeArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeArguments(java8Parser.TypeArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeArgumentList(java8Parser.TypeArgumentListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeArgumentList(java8Parser.TypeArgumentListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeArgument(java8Parser.TypeArgumentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeArgument(java8Parser.TypeArgumentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWildcard(java8Parser.WildcardContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWildcard(java8Parser.WildcardContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWildcardBounds(java8Parser.WildcardBoundsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWildcardBounds(java8Parser.WildcardBoundsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPackageName(java8Parser.PackageNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPackageName(java8Parser.PackageNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeName(java8Parser.TypeNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeName(java8Parser.TypeNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPackageOrTypeName(java8Parser.PackageOrTypeNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPackageOrTypeName(java8Parser.PackageOrTypeNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpressionName(java8Parser.ExpressionNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpressionName(java8Parser.ExpressionNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodName(java8Parser.MethodNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodName(java8Parser.MethodNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAmbiguousName(java8Parser.AmbiguousNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAmbiguousName(java8Parser.AmbiguousNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCompilationUnit(java8Parser.CompilationUnitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCompilationUnit(java8Parser.CompilationUnitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPackageDeclaration(java8Parser.PackageDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPackageDeclaration(java8Parser.PackageDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPackageModifier(java8Parser.PackageModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPackageModifier(java8Parser.PackageModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterImportDeclaration(java8Parser.ImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitImportDeclaration(java8Parser.ImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSingleTypeImportDeclaration(java8Parser.SingleTypeImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSingleTypeImportDeclaration(java8Parser.SingleTypeImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeImportOnDemandDeclaration(java8Parser.TypeImportOnDemandDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeImportOnDemandDeclaration(java8Parser.TypeImportOnDemandDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSingleStaticImportDeclaration(java8Parser.SingleStaticImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSingleStaticImportDeclaration(java8Parser.SingleStaticImportDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStaticImportOnDemandDeclaration(java8Parser.StaticImportOnDemandDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStaticImportOnDemandDeclaration(java8Parser.StaticImportOnDemandDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeDeclaration(java8Parser.TypeDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeDeclaration(java8Parser.TypeDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassDeclaration(java8Parser.ClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassDeclaration(java8Parser.ClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNormalClassDeclaration(java8Parser.NormalClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNormalClassDeclaration(java8Parser.NormalClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassModifier(java8Parser.ClassModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassModifier(java8Parser.ClassModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeParameters(java8Parser.TypeParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeParameters(java8Parser.TypeParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeParameterList(java8Parser.TypeParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeParameterList(java8Parser.TypeParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSuperclass(java8Parser.SuperclassContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSuperclass(java8Parser.SuperclassContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSuperinterfaces(java8Parser.SuperinterfacesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSuperinterfaces(java8Parser.SuperinterfacesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceTypeList(java8Parser.InterfaceTypeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceTypeList(java8Parser.InterfaceTypeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassBody(java8Parser.ClassBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassBody(java8Parser.ClassBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassBodyDeclaration(java8Parser.ClassBodyDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassBodyDeclaration(java8Parser.ClassBodyDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassMemberDeclaration(java8Parser.ClassMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassMemberDeclaration(java8Parser.ClassMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFieldDeclaration(java8Parser.FieldDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFieldDeclaration(java8Parser.FieldDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFieldModifier(java8Parser.FieldModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFieldModifier(java8Parser.FieldModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableDeclaratorList(java8Parser.VariableDeclaratorListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableDeclaratorList(java8Parser.VariableDeclaratorListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableDeclarator(java8Parser.VariableDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableDeclarator(java8Parser.VariableDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableDeclaratorId(java8Parser.VariableDeclaratorIdContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableDeclaratorId(java8Parser.VariableDeclaratorIdContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableInitializer(java8Parser.VariableInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableInitializer(java8Parser.VariableInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannType(java8Parser.UnannTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannType(java8Parser.UnannTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannPrimitiveType(java8Parser.UnannPrimitiveTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannPrimitiveType(java8Parser.UnannPrimitiveTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannReferenceType(java8Parser.UnannReferenceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannReferenceType(java8Parser.UnannReferenceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannClassOrInterfaceType(java8Parser.UnannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannClassOrInterfaceType(java8Parser.UnannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannClassType(java8Parser.UnannClassTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannClassType(java8Parser.UnannClassTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannClassType_lf_unannClassOrInterfaceType(java8Parser.
			UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannClassType_lf_unannClassOrInterfaceType(java8Parser.
			UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannClassType_lfno_unannClassOrInterfaceType(java8Parser.
			UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannClassType_lfno_unannClassOrInterfaceType(java8Parser.
			UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannInterfaceType(java8Parser.UnannInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannInterfaceType(java8Parser.UnannInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannInterfaceType_lf_unannClassOrInterfaceType(java8Parser.
			UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannInterfaceType_lf_unannClassOrInterfaceType(java8Parser.
			UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(java8Parser.
			UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(java8Parser.
			UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannTypeVariable(java8Parser.UnannTypeVariableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannTypeVariable(java8Parser.UnannTypeVariableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnannArrayType(java8Parser.UnannArrayTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnannArrayType(java8Parser.UnannArrayTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodDeclaration(java8Parser.MethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodDeclaration(java8Parser.MethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodModifier(java8Parser.MethodModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodModifier(java8Parser.MethodModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodHeader(java8Parser.MethodHeaderContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodHeader(java8Parser.MethodHeaderContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterResult(java8Parser.ResultContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitResult(java8Parser.ResultContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodDeclarator(java8Parser.MethodDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFormalParameterList(java8Parser.FormalParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFormalParameterList(java8Parser.FormalParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFormalParameters(java8Parser.FormalParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFormalParameters(java8Parser.FormalParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFormalParameter(java8Parser.FormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFormalParameter(java8Parser.FormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableModifier(java8Parser.VariableModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableModifier(java8Parser.VariableModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLastFormalParameter(java8Parser.LastFormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLastFormalParameter(java8Parser.LastFormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterReceiverParameter(java8Parser.ReceiverParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitReceiverParameter(java8Parser.ReceiverParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterThrows_(java8Parser.Throws_Context ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitThrows_(java8Parser.Throws_Context ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExceptionTypeList(java8Parser.ExceptionTypeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExceptionTypeList(java8Parser.ExceptionTypeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExceptionType(java8Parser.ExceptionTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExceptionType(java8Parser.ExceptionTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodBody(java8Parser.MethodBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodBody(java8Parser.MethodBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInstanceInitializer(java8Parser.InstanceInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInstanceInitializer(java8Parser.InstanceInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStaticInitializer(java8Parser.StaticInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStaticInitializer(java8Parser.StaticInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstructorDeclaration(java8Parser.ConstructorDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstructorDeclaration(java8Parser.ConstructorDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstructorModifier(java8Parser.ConstructorModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstructorModifier(java8Parser.ConstructorModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstructorDeclarator(java8Parser.ConstructorDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstructorDeclarator(java8Parser.ConstructorDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSimpleTypeName(java8Parser.SimpleTypeNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSimpleTypeName(java8Parser.SimpleTypeNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstructorBody(java8Parser.ConstructorBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstructorBody(java8Parser.ConstructorBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExplicitConstructorInvocation(java8Parser.ExplicitConstructorInvocationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExplicitConstructorInvocation(java8Parser.ExplicitConstructorInvocationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumDeclaration(java8Parser.EnumDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumDeclaration(java8Parser.EnumDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumBody(java8Parser.EnumBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumBody(java8Parser.EnumBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumConstantList(java8Parser.EnumConstantListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumConstantList(java8Parser.EnumConstantListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumConstant(java8Parser.EnumConstantContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumConstant(java8Parser.EnumConstantContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumConstantModifier(java8Parser.EnumConstantModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumConstantModifier(java8Parser.EnumConstantModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumBodyDeclarations(java8Parser.EnumBodyDeclarationsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumBodyDeclarations(java8Parser.EnumBodyDeclarationsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceDeclaration(java8Parser.InterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceDeclaration(java8Parser.InterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNormalInterfaceDeclaration(java8Parser.NormalInterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNormalInterfaceDeclaration(java8Parser.NormalInterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceModifier(java8Parser.InterfaceModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceModifier(java8Parser.InterfaceModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExtendsInterfaces(java8Parser.ExtendsInterfacesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExtendsInterfaces(java8Parser.ExtendsInterfacesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceBody(java8Parser.InterfaceBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceBody(java8Parser.InterfaceBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceMemberDeclaration(java8Parser.InterfaceMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceMemberDeclaration(java8Parser.InterfaceMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstantDeclaration(java8Parser.ConstantDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstantDeclaration(java8Parser.ConstantDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstantModifier(java8Parser.ConstantModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstantModifier(java8Parser.ConstantModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceMethodDeclaration(java8Parser.InterfaceMethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceMethodDeclaration(java8Parser.InterfaceMethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterfaceMethodModifier(java8Parser.InterfaceMethodModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterfaceMethodModifier(java8Parser.InterfaceMethodModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnnotationTypeDeclaration(java8Parser.AnnotationTypeDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAnnotationTypeDeclaration(java8Parser.AnnotationTypeDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnnotationTypeBody(java8Parser.AnnotationTypeBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAnnotationTypeBody(java8Parser.AnnotationTypeBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnnotationTypeMemberDeclaration(java8Parser.AnnotationTypeMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAnnotationTypeMemberDeclaration(java8Parser.AnnotationTypeMemberDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnnotationTypeElementDeclaration(java8Parser.AnnotationTypeElementDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAnnotationTypeElementDeclaration(java8Parser.AnnotationTypeElementDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnnotationTypeElementModifier(java8Parser.AnnotationTypeElementModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAnnotationTypeElementModifier(java8Parser.AnnotationTypeElementModifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDefaultValue(java8Parser.DefaultValueContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDefaultValue(java8Parser.DefaultValueContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAnnotation(java8Parser.AnnotationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAnnotation(java8Parser.AnnotationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNormalAnnotation(java8Parser.NormalAnnotationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNormalAnnotation(java8Parser.NormalAnnotationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterElementValuePairList(java8Parser.ElementValuePairListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitElementValuePairList(java8Parser.ElementValuePairListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterElementValuePair(java8Parser.ElementValuePairContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitElementValuePair(java8Parser.ElementValuePairContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterElementValue(java8Parser.ElementValueContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitElementValue(java8Parser.ElementValueContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterElementValueArrayInitializer(java8Parser.ElementValueArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitElementValueArrayInitializer(java8Parser.ElementValueArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterElementValueList(java8Parser.ElementValueListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitElementValueList(java8Parser.ElementValueListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMarkerAnnotation(java8Parser.MarkerAnnotationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMarkerAnnotation(java8Parser.MarkerAnnotationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSingleElementAnnotation(java8Parser.SingleElementAnnotationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSingleElementAnnotation(java8Parser.SingleElementAnnotationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArrayInitializer(java8Parser.ArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayInitializer(java8Parser.ArrayInitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariableInitializerList(java8Parser.VariableInitializerListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariableInitializerList(java8Parser.VariableInitializerListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBlock(java8Parser.BlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBlock(java8Parser.BlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBlockStatements(java8Parser.BlockStatementsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBlockStatements(java8Parser.BlockStatementsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBlockStatement(java8Parser.BlockStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBlockStatement(java8Parser.BlockStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLocalVariableDeclarationStatement(java8Parser.LocalVariableDeclarationStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLocalVariableDeclarationStatement(java8Parser.LocalVariableDeclarationStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLocalVariableDeclaration(java8Parser.LocalVariableDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLocalVariableDeclaration(java8Parser.LocalVariableDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatement(java8Parser.StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatement(java8Parser.StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementNoShortIf(java8Parser.StatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementNoShortIf(java8Parser.StatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementWithoutTrailingSubstatement(java8Parser.StatementWithoutTrailingSubstatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementWithoutTrailingSubstatement(java8Parser.StatementWithoutTrailingSubstatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEmptyStatement(java8Parser.EmptyStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEmptyStatement(java8Parser.EmptyStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLabeledStatement(java8Parser.LabeledStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLabeledStatement(java8Parser.LabeledStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLabeledStatementNoShortIf(java8Parser.LabeledStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLabeledStatementNoShortIf(java8Parser.LabeledStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpressionStatement(java8Parser.ExpressionStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpressionStatement(java8Parser.ExpressionStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementExpression(java8Parser.StatementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementExpression(java8Parser.StatementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIfThenStatement(java8Parser.IfThenStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIfThenStatement(java8Parser.IfThenStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIfThenElseStatement(java8Parser.IfThenElseStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIfThenElseStatement(java8Parser.IfThenElseStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIfThenElseStatementNoShortIf(java8Parser.IfThenElseStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIfThenElseStatementNoShortIf(java8Parser.IfThenElseStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssertStatement(java8Parser.AssertStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssertStatement(java8Parser.AssertStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSwitchStatement(java8Parser.SwitchStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSwitchStatement(java8Parser.SwitchStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSwitchBlock(java8Parser.SwitchBlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSwitchBlock(java8Parser.SwitchBlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSwitchBlockStatementGroup(java8Parser.SwitchBlockStatementGroupContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSwitchBlockStatementGroup(java8Parser.SwitchBlockStatementGroupContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSwitchLabels(java8Parser.SwitchLabelsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSwitchLabels(java8Parser.SwitchLabelsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSwitchLabel(java8Parser.SwitchLabelContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSwitchLabel(java8Parser.SwitchLabelContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumConstantName(java8Parser.EnumConstantNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumConstantName(java8Parser.EnumConstantNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWhileStatement(java8Parser.WhileStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWhileStatement(java8Parser.WhileStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWhileStatementNoShortIf(java8Parser.WhileStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWhileStatementNoShortIf(java8Parser.WhileStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDoStatement(java8Parser.DoStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDoStatement(java8Parser.DoStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForStatement(java8Parser.ForStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForStatement(java8Parser.ForStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForStatementNoShortIf(java8Parser.ForStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForStatementNoShortIf(java8Parser.ForStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBasicForStatement(java8Parser.BasicForStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBasicForStatement(java8Parser.BasicForStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBasicForStatementNoShortIf(java8Parser.BasicForStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBasicForStatementNoShortIf(java8Parser.BasicForStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForInit(java8Parser.ForInitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForInit(java8Parser.ForInitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForUpdate(java8Parser.ForUpdateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForUpdate(java8Parser.ForUpdateContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatementExpressionList(java8Parser.StatementExpressionListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatementExpressionList(java8Parser.StatementExpressionListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnhancedForStatement(java8Parser.EnhancedForStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnhancedForStatement(java8Parser.EnhancedForStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnhancedForStatementNoShortIf(java8Parser.EnhancedForStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnhancedForStatementNoShortIf(java8Parser.EnhancedForStatementNoShortIfContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBreakStatement(java8Parser.BreakStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBreakStatement(java8Parser.BreakStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterContinueStatement(java8Parser.ContinueStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitContinueStatement(java8Parser.ContinueStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterReturnStatement(java8Parser.ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitReturnStatement(java8Parser.ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterThrowStatement(java8Parser.ThrowStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitThrowStatement(java8Parser.ThrowStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSynchronizedStatement(java8Parser.SynchronizedStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSynchronizedStatement(java8Parser.SynchronizedStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTryStatement(java8Parser.TryStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTryStatement(java8Parser.TryStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCatches(java8Parser.CatchesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCatches(java8Parser.CatchesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCatchClause(java8Parser.CatchClauseContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCatchClause(java8Parser.CatchClauseContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCatchFormalParameter(java8Parser.CatchFormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCatchFormalParameter(java8Parser.CatchFormalParameterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCatchType(java8Parser.CatchTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCatchType(java8Parser.CatchTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFinally_(java8Parser.Finally_Context ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFinally_(java8Parser.Finally_Context ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTryWithResourcesStatement(java8Parser.TryWithResourcesStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTryWithResourcesStatement(java8Parser.TryWithResourcesStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterResourceSpecification(java8Parser.ResourceSpecificationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitResourceSpecification(java8Parser.ResourceSpecificationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterResourceList(java8Parser.ResourceListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitResourceList(java8Parser.ResourceListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterResource(java8Parser.ResourceContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitResource(java8Parser.ResourceContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimary(java8Parser.PrimaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimary(java8Parser.PrimaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimaryNoNewArray(java8Parser.PrimaryNoNewArrayContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimaryNoNewArray(java8Parser.PrimaryNoNewArrayContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimaryNoNewArray_lf_arrayAccess(java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimaryNoNewArray_lf_arrayAccess(java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimaryNoNewArray_lfno_arrayAccess(java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimaryNoNewArray_lfno_arrayAccess(java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimaryNoNewArray_lf_primary(java8Parser.PrimaryNoNewArray_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimaryNoNewArray_lf_primary(java8Parser.PrimaryNoNewArray_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(java8Parser.
			PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(java8Parser.
			PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(java8Parser.
			PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(java8Parser.
			PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimaryNoNewArray_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimaryNoNewArray_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(java8Parser.
			PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(java8Parser.
			PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(java8Parser.
			PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(java8Parser.
			PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassInstanceCreationExpression(java8Parser.ClassInstanceCreationExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassInstanceCreationExpression(java8Parser.ClassInstanceCreationExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassInstanceCreationExpression_lf_primary(java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassInstanceCreationExpression_lf_primary(java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassInstanceCreationExpression_lfno_primary(java8Parser.
			ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClassInstanceCreationExpression_lfno_primary(java8Parser.
			ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeArgumentsOrDiamond(java8Parser.TypeArgumentsOrDiamondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeArgumentsOrDiamond(java8Parser.TypeArgumentsOrDiamondContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFieldAccess(java8Parser.FieldAccessContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFieldAccess(java8Parser.FieldAccessContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFieldAccess_lf_primary(java8Parser.FieldAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFieldAccess_lf_primary(java8Parser.FieldAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFieldAccess_lfno_primary(java8Parser.FieldAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFieldAccess_lfno_primary(java8Parser.FieldAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArrayAccess(java8Parser.ArrayAccessContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayAccess(java8Parser.ArrayAccessContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArrayAccess_lf_primary(java8Parser.ArrayAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayAccess_lf_primary(java8Parser.ArrayAccess_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArrayAccess_lfno_primary(java8Parser.ArrayAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayAccess_lfno_primary(java8Parser.ArrayAccess_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodInvocation(java8Parser.MethodInvocationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodInvocation(java8Parser.MethodInvocationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodInvocation_lf_primary(java8Parser.MethodInvocation_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodInvocation_lf_primary(java8Parser.MethodInvocation_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodInvocation_lfno_primary(java8Parser.MethodInvocation_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodInvocation_lfno_primary(java8Parser.MethodInvocation_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArgumentList(java8Parser.ArgumentListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArgumentList(java8Parser.ArgumentListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodReference(java8Parser.MethodReferenceContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodReference(java8Parser.MethodReferenceContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodReference_lf_primary(java8Parser.MethodReference_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodReference_lf_primary(java8Parser.MethodReference_lf_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodReference_lfno_primary(java8Parser.MethodReference_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodReference_lfno_primary(java8Parser.MethodReference_lfno_primaryContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArrayCreationExpression(java8Parser.ArrayCreationExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayCreationExpression(java8Parser.ArrayCreationExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDimExprs(java8Parser.DimExprsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDimExprs(java8Parser.DimExprsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDimExpr(java8Parser.DimExprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDimExpr(java8Parser.DimExprContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstantExpression(java8Parser.ConstantExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstantExpression(java8Parser.ConstantExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpression(java8Parser.ExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpression(java8Parser.ExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLambdaExpression(java8Parser.LambdaExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLambdaExpression(java8Parser.LambdaExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLambdaParameters(java8Parser.LambdaParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLambdaParameters(java8Parser.LambdaParametersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInferredFormalParameterList(java8Parser.InferredFormalParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInferredFormalParameterList(java8Parser.InferredFormalParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLambdaBody(java8Parser.LambdaBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLambdaBody(java8Parser.LambdaBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssignmentExpression(java8Parser.AssignmentExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssignmentExpression(java8Parser.AssignmentExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssignment(java8Parser.AssignmentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssignment(java8Parser.AssignmentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLeftHandSide(java8Parser.LeftHandSideContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLeftHandSide(java8Parser.LeftHandSideContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssignmentOperator(java8Parser.AssignmentOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssignmentOperator(java8Parser.AssignmentOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConditionalExpression(java8Parser.ConditionalExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConditionalExpression(java8Parser.ConditionalExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConditionalOrExpression(java8Parser.ConditionalOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConditionalOrExpression(java8Parser.ConditionalOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConditionalAndExpression(java8Parser.ConditionalAndExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConditionalAndExpression(java8Parser.ConditionalAndExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInclusiveOrExpression(java8Parser.InclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInclusiveOrExpression(java8Parser.InclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExclusiveOrExpression(java8Parser.ExclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExclusiveOrExpression(java8Parser.ExclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAndExpression(java8Parser.AndExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAndExpression(java8Parser.AndExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEqualityExpression(java8Parser.EqualityExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEqualityExpression(java8Parser.EqualityExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterRelationalExpression(java8Parser.RelationalExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitRelationalExpression(java8Parser.RelationalExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterShiftExpression(java8Parser.ShiftExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitShiftExpression(java8Parser.ShiftExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAdditiveExpression(java8Parser.AdditiveExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAdditiveExpression(java8Parser.AdditiveExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMultiplicativeExpression(java8Parser.MultiplicativeExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMultiplicativeExpression(java8Parser.MultiplicativeExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnaryExpression(java8Parser.UnaryExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnaryExpression(java8Parser.UnaryExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPreIncrementExpression(java8Parser.PreIncrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPreIncrementExpression(java8Parser.PreIncrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPreDecrementExpression(java8Parser.PreDecrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPreDecrementExpression(java8Parser.PreDecrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnaryExpressionNotPlusMinus(java8Parser.UnaryExpressionNotPlusMinusContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnaryExpressionNotPlusMinus(java8Parser.UnaryExpressionNotPlusMinusContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPostfixExpression(java8Parser.PostfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPostfixExpression(java8Parser.PostfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPostIncrementExpression(java8Parser.PostIncrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPostIncrementExpression(java8Parser.PostIncrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPostIncrementExpression_lf_postfixExpression(java8Parser.
			PostIncrementExpression_lf_postfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPostIncrementExpression_lf_postfixExpression(java8Parser.
			PostIncrementExpression_lf_postfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPostDecrementExpression(java8Parser.PostDecrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPostDecrementExpression(java8Parser.PostDecrementExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPostDecrementExpression_lf_postfixExpression(java8Parser.
			PostDecrementExpression_lf_postfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPostDecrementExpression_lf_postfixExpression(java8Parser.
			PostDecrementExpression_lf_postfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCastExpression(java8Parser.CastExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCastExpression(java8Parser.CastExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}
    
}