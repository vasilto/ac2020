import java.util.ArrayList;
import java.util.Stack;

public class day1 {

    static String input = "1509\n" +
            "1857\n" +
            "1736\n" +
            "1815\n" +
            "1576\n" +
            "1970\n" +
            "1567\n" +
            "1778\n" +
            "1508\n" +
            "1833\n" +
            "1377\n" +
            "1890\n" +
            "1375\n" +
            "1396\n" +
            "1102\n" +
            "1639\n" +
            "1818\n" +
            "1469\n" +
            "1138\n" +
            "1333\n" +
            "1906\n" +
            "1557\n" +
            "1686\n" +
            "1712\n" +
            "1990\n" +
            "1930\n" +
            "1761\n" +
            "1881\n" +
            "1551\n" +
            "1627\n" +
            "1801\n" +
            "1728\n" +
            "1960\n" +
            "1407\n" +
            "1832\n" +
            "1842\n" +
            "1393\n" +
            "1870\n" +
            "1295\n" +
            "1528\n" +
            "251\n" +
            "1945\n" +
            "1589\n" +
            "1850\n" +
            "1650\n" +
            "1793\n" +
            "1997\n" +
            "1758\n" +
            "1477\n" +
            "1697\n" +
            "1081\n" +
            "1825\n" +
            "1899\n" +
            "1171\n" +
            "1104\n" +
            "1839\n" +
            "1974\n" +
            "1630\n" +
            "1831\n" +
            "1671\n" +
            "1723\n" +
            "1811\n" +
            "1489\n" +
            "1647\n" +
            "1486\n" +
            "1107\n" +
            "1786\n" +
            "1680\n" +
            "1942\n" +
            "1640\n" +
            "1112\n" +
            "1703\n" +
            "1315\n" +
            "1769\n" +
            "1966\n" +
            "997\n" +
            "2010\n" +
            "1635\n" +
            "1196\n" +
            "383\n" +
            "1986\n" +
            "1860\n" +
            "1743\n" +
            "1756\n" +
            "1555\n" +
            "1111\n" +
            "1823\n" +
            "48\n" +
            "1953\n" +
            "1083\n" +
            "1804\n" +
            "1933\n" +
            "1626\n" +
            "1895\n" +
            "1807\n" +
            "1669\n" +
            "1783\n" +
            "389\n" +
            "1821\n" +
            "1883\n" +
            "1114\n" +
            "1587\n" +
            "1941\n" +
            "1725\n" +
            "1646\n" +
            "456\n" +
            "1550\n" +
            "1939\n" +
            "1975\n" +
            "1324\n" +
            "1201\n" +
            "1018\n" +
            "1001\n" +
            "1402\n" +
            "1885\n" +
            "1481\n" +
            "1633\n" +
            "1781\n" +
            "1622\n" +
            "1822\n" +
            "1559\n" +
            "1696\n" +
            "1510\n" +
            "1251\n" +
            "1732\n" +
            "1790\n" +
            "1813\n" +
            "1695\n" +
            "1121\n" +
            "704\n" +
            "1964\n" +
            "1984\n" +
            "1763\n" +
            "1656\n" +
            "1183\n" +
            "1771\n" +
            "1276\n" +
            "1764\n" +
            "1810\n" +
            "1992\n" +
            "1213\n" +
            "1840\n" +
            "1318\n" +
            "1965\n" +
            "1943\n" +
            "1549\n" +
            "1768\n" +
            "1506\n" +
            "1949\n" +
            "1739\n" +
            "1852\n" +
            "1787\n" +
            "1570\n" +
            "1988\n" +
            "1357\n" +
            "1909\n" +
            "1837\n" +
            "561\n" +
            "1994\n" +
            "1777\n" +
            "1547\n" +
            "1925\n" +
            "1897\n" +
            "1817\n" +
            "1677\n" +
            "1668\n" +
            "1982\n" +
            "1667\n" +
            "1753\n" +
            "1041\n" +
            "1826\n" +
            "1961\n" +
            "1797\n" +
            "1765\n" +
            "1720\n" +
            "1835\n" +
            "1688\n" +
            "1705\n" +
            "1744\n" +
            "1977\n" +
            "1971\n" +
            "1775\n" +
            "1782\n" +
            "1661\n" +
            "1385\n" +
            "1162\n" +
            "1755\n" +
            "1846\n" +
            "1674\n" +
            "1698\n" +
            "1882\n" +
            "1766\n" +
            "1820\n" +
            "1531\n" +
            "1577\n" +
            "1710\n" +
            "1382\n" +
            "1246\n" +
            "1864\n" +
            "1702";

    static Integer convertStringToInt(String string) {
        return Integer.valueOf(string);
    }

    static Stack<Integer> stackOfIntegers() {
        Stack<Integer> tempStack = new Stack<Integer>();
        for (String string :
                input.split("\n")) {
            tempStack.add(convertStringToInt(string));
        }
        return tempStack;
    }

    static void dayOneSolution() {
        boolean flagToContinue = true;
        for (int singleInputValue :
                stackOfIntegers()) {
            int startIndex = 1;
            int newIndex = startIndex;
            do {
                int valueOfNewIndex = stackOfIntegers().get(newIndex);
                if (singleInputValue + valueOfNewIndex == 2020) {
                    System.out.println(singleInputValue*valueOfNewIndex);
                    System.out.println("value of first index " + singleInputValue);
                    System.out.println("value of second index" + valueOfNewIndex);
                    flagToContinue = false;
                    break;
                }
                newIndex++;
                if (newIndex > stackOfIntegers().size() - 1) {
                    stackOfIntegers().pop();
                    break;
                }
            } while (true);
            if (!flagToContinue) {
                break;
            }
        }
    }

    static void dayOneSolutionPartTwo() {
        boolean flagToContinue = true;
        for (int singleInputValue :
                stackOfIntegers()) {
            int secondInputIndex = 1;
            int tempSecondIndex = secondInputIndex;
            for (int thirdInputIndex = 2; thirdInputIndex < stackOfIntegers().size(); thirdInputIndex++) {
                do {
                    if (singleInputValue + stackOfIntegers().get(tempSecondIndex) + stackOfIntegers().get(thirdInputIndex) == 2000) {
                        System.out.println(singleInputValue*stackOfIntegers().get(tempSecondIndex)*stackOfIntegers().get(thirdInputIndex));
                        flagToContinue = false;
                        break;
                    }
                    thirdInputIndex++;
                    if (thirdInputIndex > stackOfIntegers().size()-1) {
                        stackOfIntegers().remove(0);
                        break;
                    }
                } while (true);
                tempSecondIndex++;
                if (tempSecondIndex > stackOfIntegers().size()-1) {
                    break;
                }
                thirdInputIndex = 2;
            }

            if (!flagToContinue) {
                break;
            }
        }
    }

    static void dayOneSolutionPartTwoOptionTwo() {
        boolean toContinue = true;
        for (int firstElementValue = 0; firstElementValue < stackOfIntegers().size() - 2; firstElementValue++) {
            for (int secondElementValue = 1; secondElementValue < stackOfIntegers().size() - 1; secondElementValue++) {
                for (int thirdElementValue = 2; thirdElementValue < stackOfIntegers().size(); thirdElementValue ++) {
                    if (stackOfIntegers().get(firstElementValue) + stackOfIntegers().get(secondElementValue) + stackOfIntegers().get(thirdElementValue) == 2020) {
                        System.out.println(stackOfIntegers().get(firstElementValue) * stackOfIntegers().get(secondElementValue) * stackOfIntegers().get(thirdElementValue));
                        toContinue = false;
                        break;
                    }
                    }
                if (!toContinue) {
                    break;
                }
            }
            if (!toContinue) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        dayOneSolutionPartTwoOptionTwo();
    }
}
