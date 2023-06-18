package school.mjc.stage0.module3.task2;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.type.PrimitiveType;
import org.junit.jupiter.api.Test;
import school.mjc.test.BaseIOTest;
import school.mjc.test.JavaFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static school.mjc.parser.predicate.Dsl.declaration;

@JavaFileSource("src/main/java/school/mjc/stage0/module3/task2/JavaVariableNames.java")
class JavaVariableNamesTest extends BaseIOTest {

    @Test
    public void verifyEightVariables(CompilationUnit parsed) {
        int intVariables = parsed.findAll(VariableDeclarator.class,
            declaration().ofPrimitiveType(PrimitiveType.Primitive.INT)).size();
        assertEquals(8, intVariables,
                "Please don't remove variables or change their types, just update names");
    }
}
