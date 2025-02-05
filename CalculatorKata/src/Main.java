import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            String decision = cals(scanner.nextLine());
            if (decision == null) {
                throw new Exception();
            } else if (decision.equals("")) {
                throw new Exception();
            } else {
                System.out.println(decision);
                romanNumbers = 0;
            }
        }
    }

    public static String cals(String input) {
        input = input.replaceAll("\\s", "");
        String[] plus = input.split("\\+");
        String[] minus = input.split("-");
        String[] share = input.split("\\*");
        String[] multiply = input.split("/");
        int decision;
        if (plus.length == 2) {
            plus[0] = rim(plus[0]);
            plus[1] = rim(plus[1]);
            int firstNumber = Integer.parseInt(plus[0]);
            int secondNumber = Integer.parseInt(plus[1]);
            if (firstNumber <= 10) {
                if (secondNumber <= 10) {
                    decision = firstNumber + secondNumber;
                    if (romanNumbers == 1) {
                        return null;
                    }
                    if (romanNumbers == 2) {
                        return rim(Integer.toString(decision));
                    } else {
                        return Integer.toString(decision);
                    }
                }
                return null;
            }
            return null;
        } else {
            if (minus.length == 2) {
                minus[0] = rim(minus[0]);
                minus[1] = rim(minus[1]);
                int firstNumber = Integer.parseInt(minus[0]);
                int secondNumber = Integer.parseInt(minus[1]);
                if (firstNumber <= 10) {
                    if (secondNumber <= 10) {
                        decision = firstNumber - secondNumber;
                        if (romanNumbers == 1) {
                            return null;
                        }
                        if (romanNumbers == 2) {
                            return rim(Integer.toString(decision));
                        } else {
                            return Integer.toString(decision);
                        }
                    }
                    return null;
                }
                return null;
            } else {
                if (share.length == 2) {
                    share[0] = rim(share[0]);
                    share[1] = rim(share[1]);
                    int firstNumber = Integer.parseInt(share[0]);
                    int secondNumber = Integer.parseInt(share[1]);
                    if (firstNumber <= 10) {
                        if (secondNumber <= 10) {
                            decision = firstNumber * secondNumber;
                            if (romanNumbers == 1) {
                                return null;
                            }
                            if (romanNumbers == 2) {
                                return rim(Integer.toString(decision));
                            } else {
                                return Integer.toString(decision);
                            }
                        }
                        return null;
                    }
                    return null;
                } else {
                    if (multiply.length == 2) {
                        multiply[0] = rim(multiply[0]);
                        multiply[1] = rim(multiply[1]);
                        int firstNumber = Integer.parseInt(multiply[0]);
                        int secondNumber = Integer.parseInt(multiply[1]);
                        if (firstNumber <= 10) {
                            if (secondNumber <= 10) {
                                decision = firstNumber / secondNumber;
                                if (romanNumbers == 1) {
                                    return null;
                                }
                                if (romanNumbers == 2) {
                                    return rim(Integer.toString(decision));
                                } else {
                                    return Integer.toString(decision);
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                }
            }
        }
        return null;
    }

    static int romanNumbers = 0;

    static String rim(String scan) {
        String[] chislo = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        if (romanNumbers == 2) {
            return chislo[Integer.parseInt(scan)];
        }
        for (int i = 0; i < 101; i++) {
            if (scan.equals(chislo[i])) {
                scan = Integer.toString(i);
                romanNumbers = romanNumbers + 1;
            }
        }
        return scan;
    }
}