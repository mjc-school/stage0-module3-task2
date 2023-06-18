package school.mjc.stage0.module3.task2;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import org.junit.jupiter.api.Test;
import school.mjc.test.BaseIOTest;
import school.mjc.test.JavaFileSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@JavaFileSource("src/main/java/school/mjc/stage0/module3/task2/NamingConvention.java")
class NamingConventionTest extends BaseIOTest {
    @Test
    void containsUpdatedVariableNamesAccordingToConvention(CompilationUnit parsed) throws IOException {
        assertIntExists(parsed, "variable");
        assertIntExists(parsed, "variableOne");
        assertIntExists(parsed, "variableTwo");
        assertIntExists(parsed, "variableThree");
        assertFinalIntExists(parsed, "VARIABLE_FOUR");
        assertFinalIntExists(parsed, "VARIABLE_FIVE");
        assertIntExists(parsed, "variableSix");
        assertIntExists(parsed, "variableSeven");
        assertIntExists(parsed, "variableEight");
    }

    private void assertFinalIntExists(CompilationUnit parsed, String name) {
        assertIntExists(parsed, name, true);
    }

    private void assertIntExists(CompilationUnit parsed, String name) {
        assertIntExists(parsed, name, false);
    }

    private void assertIntExists(CompilationUnit parsed, String name, boolean isFinal) {
        int matchingVariables = parsed.findAll(VariableDeclarationExpr.class, fd -> {
            if (fd.getVariables().size() != 1 || fd.isFinal() != isFinal) {
                return false;
            }
            VariableDeclarator variableDeclarator = fd.getVariables().get(0);
            return variableDeclarator.getName().getIdentifier().equals(name) &&
                    variableDeclarator.getType().isPrimitiveType() &&
                    variableDeclarator.getType().asPrimitiveType().getType().name().equals("INT");
        }).size();

        assertEquals(1, matchingVariables,
                "Not all variables follow the convention. Don't remove variables or final modifiers");
    }

}
