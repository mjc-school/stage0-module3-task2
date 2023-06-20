package school.mjc.stage0.module3.task2;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import org.junit.jupiter.api.Test;
import school.mjc.test.BaseIOTest;
import school.mjc.test.JavaFileSource;

import static org.junit.jupiter.api.Assertions.*;

@JavaFileSource("src/main/java/school/mjc/stage0/module3/task2/AdvancedNamingConvention.java")
class AdvancedNamingConventionTest extends BaseIOTest {
    
    @Test
    void namesFromJavaConvention(CompilationUnit parsed) {
        boolean className = parsed.findAll(ClassOrInterfaceDeclaration.class,
                        cd -> cd.getName().getIdentifier().equals("AdvancedNamingConvention"))
                .size() == 1;
        boolean staticVarName = parsed.findAll(FieldDeclaration.class, fd -> fd.isStatic()
                        && fd.getVariables().size() == 1
                        && fd.getVariables().get(0).getName().getIdentifier().equals("ADULT_AGE"))
                .size() == 1;
        boolean ageVarName = parsed.findAll(FieldDeclaration.class, fd -> !fd.isStatic()
                        && fd.getVariables().size() == 1
                        && fd.getVariables().get(0).getName().getIdentifier().equals("age"))
                .size() == 1;
        boolean firstMethodName = parsed.findAll(MethodDeclaration.class, md -> !md.isStatic()
                        && md.getName().getIdentifier().equals("callToFriend"))
                .size() == 1;
        boolean secondMethodName = parsed.findAll(MethodDeclaration.class, md -> !md.isStatic()
                        && md.getName().getIdentifier().equals("callByNumber")
                        && md.getParameters().size() == 1
                        && md.getParameters().get(0).getName().getIdentifier().equals("number"))
                .size() == 1;

        assertTrue(className && staticVarName && ageVarName && firstMethodName && secondMethodName,
                "Not all conventions were followed. Check what to call classes, fields, variables and methods.");
    }
}
