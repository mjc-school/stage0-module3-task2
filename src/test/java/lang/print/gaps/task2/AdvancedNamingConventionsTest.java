package lang.print.gaps.task2;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedNamingConventionsTest {
    @Test
    void namesFromJavaConvention() throws IOException {
        Path path = Paths.get("src/main/java/lang/print/gaps/task2/AdvancedNamingConvention.java");
        List<String> strings = Files.readAllLines(path);
        List<String> result = strings.stream()
                .filter(line ->
                        line.contains("class AdvancedNamingConvention") ||
                                line.contains("ADULT_AGE") ||
                                line.contains("age;") ||
                                line.contains("void callToFriend") ||
                                line.contains("void callByNumber(int number)"))
                .collect(Collectors.toList());

        assertEquals(5, result.size(), "Not all conventions were followed. Check what to call classes variables and methods.");
    }

}