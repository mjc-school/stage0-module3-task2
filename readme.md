## Tasks:

#### 1) Java variable names.

Make the program work (var starts with 1, $, % etc).
Update given code so as to be able to compile it:

    public class JavaVariableNames {
        public static void main(String[] args) {
            int 2morrow = 0;
            int $money = 10;
            int %hundred = 100;
            int !back = 1000;
            int _underscore = 10000;
            int #sharp = 100000;
            int *star = 1000000;
            int BADEXAMPLEOFVARNAME = 1000000;
        }
    }

#### 2) Copied names.

Make the program work (vars have the same names).
Update given code so as to be able to compile it:

    public class CopiedNames {
        public static void main(String[] args) {
            int variable = 0;
            int variable = 2000;
            int value = 1000;
            int variable = 4000;
            int value2 = 3000;
            int variables = 5000;
            variables = 7000;
            int value = 90000;
            int int = 100000;
            int my integer = 1000000;
            int my+var = 1234567;
            int my__-__integer = 1234567;
        }
    }

#### 3) Naming conventions.

Update given code so that it is corresponding to java name conventions,
notice the constants with the keyword **final**, following the case of variables (if the
variable in example is in snake case this pattern should be followed):

    public class NamingConvention {
        public static void main(String[] args) {
             int _variable = 10;
             int variable_One = 1;
             int variableTwo = 2;
             int variable_three = 3;
             final int VARIABLEFOUR = 4;
             final int VARIABLEfIVE = 5;
             int VariableSix = 6;
             int variableseven = 7;
             int VariableEight = 8;
        }
    }

#### 4) Advanced naming convention.

(After advanced reading about java naming conventions ) In the given code snippet make the program correspond to java
code conventions (method, class, field names...):

    public class advancedNamingConvention {
        private static final int adult_age = 18;
    
        private int AGE;
        private int phoneNumber;
    
        void CAllToFriend() {
            //some code
        }
    
        void callByNumber(int Number) {
            //some code
        }
    }
