import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day4 {

    static String inputs = "eyr:2029 byr:1931 hcl:z cid:128\n" +
            "ecl:amb hgt:150cm iyr:2015 pid:148714704\n" +
            "\n" +
            "byr:2013 hgt:70cm pid:76982670 ecl:#4f9a1c\n" +
            "hcl:9e724b eyr:1981 iyr:2027\n" +
            "\n" +
            "pid:261384974 iyr:2015\n" +
            "hgt:172cm eyr:2020\n" +
            "byr:2001 hcl:#59c2d9 ecl:amb cid:163\n" +
            "\n" +
            "eyr:2024 hcl:#b6652a\n" +
            "cid:340\n" +
            "byr:1929 ecl:oth iyr:2014 pid:186640193\n" +
            "hgt:193in\n" +
            "\n" +
            "iyr:2015 eyr:2024 hgt:184cm\n" +
            "ecl:blu hcl:#a97842 byr:1959 pid:932817398\n" +
            "\n" +
            "iyr:1933 hcl:7c63aa cid:72 eyr:2028\n" +
            "ecl:hzl\n" +
            "byr:2009 hgt:164cm pid:104496116\n" +
            "\n" +
            "byr:1980\n" +
            "hgt:181cm pid:192793676 hcl:8f6ae6 iyr:2021 eyr:1978\n" +
            "\n" +
            "pid:#63f479 hgt:75cm\n" +
            "hcl:z iyr:1956\n" +
            "byr:2024 ecl:#051344\n" +
            "\n" +
            "byr:2014 pid:159cm\n" +
            "hgt:161cm\n" +
            "ecl:#b4eef2\n" +
            "iyr:2027 eyr:1933 hcl:743b1a\n" +
            "\n" +
            "cid:79 hgt:172cm byr:1932 eyr:2020 pid:127319843 hcl:#6b5442 iyr:2017 ecl:brn\n" +
            "\n" +
            "ecl:gry eyr:2020 byr:1976\n" +
            "pid:093137171 iyr:2012 hgt:178cm hcl:#733820\n" +
            "\n" +
            "byr:1933 hcl:#733820 hgt:165cm eyr:2027 iyr:2018 ecl:oth pid:0952910465\n" +
            "\n" +
            "iyr:2014\n" +
            "byr:1965 pid:304542033\n" +
            "eyr:2032\n" +
            "ecl:brn hgt:153in cid:259 hcl:z\n" +
            "\n" +
            "byr:2004 ecl:amb iyr:2013\n" +
            "hcl:#a97842\n" +
            "hgt:68in\n" +
            "pid:248926471 eyr:1930\n" +
            "\n" +
            "pid:048596900 iyr:2021 byr:2021 eyr:2021 cid:104\n" +
            "hcl:c3c9e0 ecl:hzl\n" +
            "hgt:75cm\n" +
            "\n" +
            "pid:590195280 cid:159 byr:1951 hcl:#ceb3a1 ecl:brn iyr:2012 hgt:189cm eyr:2024\n" +
            "\n" +
            "iyr:2015 pid:639647361 hcl:#b6652a\n" +
            "hgt:151cm byr:1957 cid:284\n" +
            "ecl:gry\n" +
            "eyr:2026\n" +
            "\n" +
            "ecl:blu hgt:175cm pid:462959720 hcl:#602927 iyr:2014 byr:1972\n" +
            "eyr:2023\n" +
            "\n" +
            "ecl:blu eyr:2023 hgt:175cm\n" +
            "pid:090406335 hcl:#b6652a iyr:2012 byr:1921\n" +
            "\n" +
            "eyr:2025 hcl:#733820\n" +
            "pid:775468504 ecl:hzl byr:1934 hgt:187cm iyr:2019\n" +
            "\n" +
            "ecl:#b35d5b hgt:121 hcl:z iyr:2002 eyr:2034\n" +
            "byr:2014\n" +
            "\n" +
            "ecl:hzl byr:2026 hgt:77 iyr:1952\n" +
            "hcl:#a97842 pid:#1461ed\n" +
            "eyr:1921\n" +
            "\n" +
            "iyr:2019\n" +
            "hgt:171in eyr:2040 pid:788162609 ecl:grn byr:2023\n" +
            "\n" +
            "hcl:#efcc98 eyr:2039 hgt:158cm byr:2026 pid:216112069\n" +
            "\n" +
            "ecl:blu hcl:#fffffd eyr:2020 pid:496018604\n" +
            "byr:1982 hgt:168cm\n" +
            "cid:70 iyr:2016\n" +
            "\n" +
            "eyr:2031 iyr:1958\n" +
            "hcl:#c0946f hgt:181in ecl:#f88f2c pid:7896132641\n" +
            "\n" +
            "byr:1933 cid:118 eyr:2037 hcl:#cfa07d iyr:2030\n" +
            "ecl:#686f76 hgt:170\n" +
            "\n" +
            "iyr:2010\n" +
            "hgt:161cm ecl:grn byr:1958 hcl:#7d3b0c\n" +
            "pid:523557068\n" +
            "\n" +
            "hcl:ba3af2 pid:157cm eyr:2037 cid:135 ecl:zzz hgt:153 byr:2030\n" +
            "\n" +
            "ecl:grn byr:1967 cid:191\n" +
            "iyr:2012 hcl:#866857\n" +
            "pid:822899368 hgt:152cm eyr:2024\n" +
            "\n" +
            "iyr:2015\n" +
            "cid:343 hcl:#6b5442 pid:119981062 hgt:67in eyr:2027\n" +
            "ecl:gry\n" +
            "byr:2001\n" +
            "\n" +
            "pid:#c68245 ecl:blu hgt:107 hcl:74f3fb eyr:1996 iyr:1955 byr:2025\n" +
            "\n" +
            "hgt:63cm eyr:1925\n" +
            "iyr:2019 byr:2013 pid:#3ab227 ecl:#e33d1d hcl:#efcc98\n" +
            "\n" +
            "byr:1941 eyr:2029 iyr:2011 hgt:159cm\n" +
            "hcl:#602927\n" +
            "ecl:brn cid:245 pid:977877701\n" +
            "\n" +
            "pid:575539099\n" +
            "eyr:2031 byr:1987 ecl:oth hcl:#cfa07d\n" +
            "iyr:2017\n" +
            "hgt:69cm\n" +
            "\n" +
            "pid:563180951 hgt:153cm ecl:amb iyr:2016\n" +
            "byr:1951 hcl:#341e13 eyr:2029\n" +
            "cid:277\n" +
            "\n" +
            "hcl:#623a2f iyr:2011 hgt:171cm byr:1929 ecl:oth\n" +
            "eyr:2024 pid:959212059\n" +
            "\n" +
            "byr:1943 ecl:#3925f3 hgt:68cm pid:155cm cid:127 eyr:2011\n" +
            "hcl:2a53fd\n" +
            "iyr:2030\n" +
            "\n" +
            "hgt:160in byr:2014 pid:7846412647\n" +
            "hcl:2d18c8\n" +
            "ecl:#8655df eyr:2034 iyr:2023\n" +
            "\n" +
            "byr:1932 hgt:170cm cid:331 eyr:2020 pid:52551410 ecl:gry\n" +
            "iyr:2013\n" +
            "hcl:#c6944c\n" +
            "\n" +
            "hcl:#888785 pid:177cm ecl:oth\n" +
            "hgt:160cm eyr:2021 byr:1957\n" +
            "iyr:2013\n" +
            "\n" +
            "iyr:2020 pid:6245137 eyr:2027 cid:111 hgt:181cm\n" +
            "byr:2024 ecl:gmt hcl:fe8828\n" +
            "\n" +
            "pid:648300488 cid:230 hcl:#efcc98\n" +
            "byr:1989 hgt:159cm\n" +
            "ecl:gry iyr:2015\n" +
            "eyr:2030\n" +
            "\n" +
            "iyr:1929 cid:144 hgt:168in pid:185cm\n" +
            "byr:2017 hcl:z eyr:1960 ecl:#d406d2\n" +
            "\n" +
            "hcl:3a4933\n" +
            "hgt:155cm\n" +
            "pid:337576945 byr:1925 iyr:2014 ecl:brn eyr:2026\n" +
            "\n" +
            "pid:170cm cid:291 eyr:2017 iyr:2017 hgt:177cm hcl:z ecl:gmt\n" +
            "\n" +
            "pid:271148544 hgt:163cm\n" +
            "byr:1926 hcl:#fffffd iyr:2013\n" +
            "eyr:2022\n" +
            "\n" +
            "hgt:64in iyr:2030 ecl:#15c6b5 eyr:2028 byr:2025\n" +
            "pid:3426144\n" +
            "\n" +
            "eyr:1923 byr:1943 hcl:#64d609 iyr:2017 pid:154cm hgt:160cm ecl:brn\n" +
            "\n" +
            "hcl:#602927 hgt:170cm ecl:utc iyr:1954 pid:370180054\n" +
            "byr:1925 cid:162\n" +
            "eyr:1983\n" +
            "\n" +
            "hcl:#888785 byr:1932 hgt:163cm\n" +
            "eyr:2026\n" +
            "ecl:grn pid:799844918\n" +
            "\n" +
            "eyr:2029\n" +
            "ecl:blu cid:231 hgt:157cm\n" +
            "pid:609233861\n" +
            "hcl:#462640\n" +
            "byr:1940 iyr:2012\n" +
            "\n" +
            "iyr:2025\n" +
            "byr:2004 pid:#e92a77\n" +
            "eyr:2014 cid:78\n" +
            "ecl:zzz hgt:187in hcl:76be6e\n" +
            "\n" +
            "eyr:2027 iyr:2012 ecl:brn byr:1955 pid:128923308\n" +
            "cid:313 hgt:156cm hcl:#623a2f\n" +
            "\n" +
            "hcl:#ceb3a1\n" +
            "hgt:178cm byr:1984\n" +
            "pid:121442385 eyr:2036 iyr:2014 ecl:hzl\n" +
            "\n" +
            "eyr:2038 ecl:#c6149f iyr:1983\n" +
            "cid:304 hgt:193 byr:2019\n" +
            "hcl:z pid:5871630079\n" +
            "\n" +
            "iyr:2028 eyr:2002\n" +
            "hgt:146\n" +
            "hcl:#623a2f\n" +
            "pid:390145814\n" +
            "byr:1937\n" +
            "\n" +
            "pid:923652966 ecl:amb\n" +
            "eyr:2027 hgt:174cm byr:1932 iyr:2014\n" +
            "hcl:#fffffd\n" +
            "\n" +
            "iyr:2026 cid:202 byr:1995 hcl:69c01a\n" +
            "hgt:164cm eyr:2020 ecl:hzl\n" +
            "\n" +
            "hgt:156cm\n" +
            "byr:2004\n" +
            "pid:537532371\n" +
            "hcl:z iyr:1988\n" +
            "eyr:2024\n" +
            "ecl:utc\n" +
            "\n" +
            "iyr:2018 byr:1924 hcl:#602927 cid:132 pid:947815343 eyr:2030 ecl:grn\n" +
            "\n" +
            "byr:1978 hcl:#c0946f iyr:2012 hgt:67cm\n" +
            "eyr:2032 pid:929470763 ecl:amb\n" +
            "\n" +
            "eyr:2028\n" +
            "pid:545502229 ecl:gry\n" +
            "hcl:#866857 hgt:182cm\n" +
            "byr:1964 iyr:2016\n" +
            "\n" +
            "hcl:z cid:82 hgt:108 byr:2010 pid:#1650b3 eyr:2020 iyr:2017 ecl:hzl\n" +
            "\n" +
            "iyr:2018\n" +
            "hgt:61cm\n" +
            "ecl:lzr byr:1980 hcl:1d4bc2 cid:306\n" +
            "pid:763925614 eyr:2006\n" +
            "\n" +
            "byr:2021 eyr:2029\n" +
            "pid:610596568\n" +
            "ecl:oth\n" +
            "hcl:#7d3b0c\n" +
            "iyr:2010 cid:83 hgt:156cm\n" +
            "\n" +
            "cid:181 ecl:hzl\n" +
            "hcl:#8d79d2\n" +
            "hgt:192cm\n" +
            "byr:1958 iyr:2014 eyr:2026 pid:118367138\n" +
            "\n" +
            "byr:1978\n" +
            "eyr:2020\n" +
            "iyr:2025 hgt:176cm\n" +
            "ecl:grn hcl:faedc2\n" +
            "\n" +
            "hgt:156cm eyr:1989 pid:#7acc45 cid:235 hcl:1332ba\n" +
            "ecl:#2b7525 iyr:1950 byr:1943\n" +
            "\n" +
            "pid:147647267 hcl:#341e13\n" +
            "ecl:hzl\n" +
            "iyr:2019\n" +
            "byr:1975\n" +
            "hgt:153cm eyr:2020\n" +
            "\n" +
            "iyr:2026 hgt:170cm ecl:oth\n" +
            "byr:2017 pid:047129729\n" +
            "eyr:2024 hcl:#733820\n" +
            "\n" +
            "hcl:#fffffd byr:1960 ecl:gry eyr:2023\n" +
            "iyr:2013 hgt:186cm pid:145757697\n" +
            "\n" +
            "hgt:64in\n" +
            "ecl:amb\n" +
            "byr:1930 pid:808797855 iyr:2019\n" +
            "hcl:#b6652a eyr:2022\n" +
            "\n" +
            "eyr:2030\n" +
            "hcl:z iyr:2013 hgt:165cm ecl:#5ba775\n" +
            "pid:168306092 byr:1988\n" +
            "\n" +
            "eyr:2026 ecl:gry iyr:2020 hcl:#b6652a hgt:177cm\n" +
            "byr:1991 pid:780666689\n" +
            "\n" +
            "iyr:2020\n" +
            "pid:#d08e64 eyr:2010 hcl:411b04 cid:140 hgt:76cm ecl:grn byr:2005\n" +
            "\n" +
            "iyr:1945\n" +
            "pid:973836167 ecl:zzz\n" +
            "hcl:z hgt:181in byr:2008 eyr:1993\n" +
            "\n" +
            "cid:58 eyr:2024 hgt:159cm byr:1977 ecl:hzl pid:402427328\n" +
            "hcl:#888785\n" +
            "iyr:2012\n" +
            "\n" +
            "pid:533381616 byr:2027\n" +
            "eyr:2040 hgt:60cm iyr:2023 hcl:z\n" +
            "ecl:gmt\n" +
            "\n" +
            "pid:229044973 cid:149 hgt:178in eyr:2029\n" +
            "byr:2006 ecl:dne iyr:2012\n" +
            "hcl:bf4bc2\n" +
            "\n" +
            "hgt:161cm byr:1973 ecl:oth iyr:2015 hcl:#341e13 pid:658452720\n" +
            "eyr:2024\n" +
            "\n" +
            "hcl:#efcc98 hgt:156cm\n" +
            "byr:1931 iyr:1997 pid:0548175409 ecl:utc\n" +
            "\n" +
            "pid:575623915 iyr:2017 eyr:2023 hcl:#733820 byr:1938\n" +
            "ecl:blu\n" +
            "hgt:185cm\n" +
            "\n" +
            "hcl:#55ebaa\n" +
            "hgt:157cm ecl:blu byr:1945\n" +
            "pid:946614649\n" +
            "eyr:2020 iyr:2012\n" +
            "\n" +
            "hgt:158cm hcl:#b80425 iyr:2017 eyr:2025 ecl:gry\n" +
            "byr:1944 pid:838975683\n" +
            "\n" +
            "hcl:#41731c iyr:2020 byr:1971 ecl:oth\n" +
            "hgt:186cm\n" +
            "eyr:2030 pid:495358045\n" +
            "\n" +
            "pid:3884291521\n" +
            "eyr:2037 hgt:74cm byr:2003 ecl:hzl iyr:2022 hcl:#888785 cid:124\n" +
            "\n" +
            "hgt:175cm cid:340 byr:1921\n" +
            "pid:183491348\n" +
            "iyr:2017 ecl:brn hcl:#602927 eyr:2028\n" +
            "\n" +
            "hcl:#cfa07d\n" +
            "hgt:161cm byr:2006\n" +
            "eyr:2024\n" +
            "pid:109854634\n" +
            "ecl:xry iyr:2024\n" +
            "\n" +
            "ecl:#ec6311 hcl:z iyr:2015\n" +
            "pid:#783693\n" +
            "eyr:1932\n" +
            "cid:271\n" +
            "hgt:82\n" +
            "\n" +
            "ecl:grn\n" +
            "hgt:164cm hcl:#efcc98 eyr:2020 pid:824236769\n" +
            "byr:1952 iyr:2014\n" +
            "\n" +
            "eyr:1964 pid:85558869 byr:2017 hcl:c81d94\n" +
            "iyr:2028\n" +
            "hgt:63cm\n" +
            "ecl:#c00640 cid:115\n" +
            "\n" +
            "byr:2010\n" +
            "pid:431600716\n" +
            "hcl:z hgt:112 ecl:#3057e9 eyr:2027 iyr:2017 cid:91\n" +
            "\n" +
            "byr:2026\n" +
            "eyr:2037\n" +
            "pid:3800489571 ecl:grn\n" +
            "cid:91 hcl:94b4d1 hgt:59cm\n" +
            "\n" +
            "cid:199 byr:2030\n" +
            "iyr:2021\n" +
            "hcl:c55653\n" +
            "hgt:168cm\n" +
            "pid:160cm\n" +
            "\n" +
            "hgt:68cm\n" +
            "byr:2025 iyr:2023 eyr:1983\n" +
            "hcl:0004d4 ecl:#19fca6 pid:89901951\n" +
            "\n" +
            "hgt:170cm byr:2012\n" +
            "eyr:1981 hcl:c95b58\n" +
            "pid:#d28b3f cid:302 iyr:1953 ecl:#151ea4\n" +
            "\n" +
            "hcl:#6b5442 eyr:2024 hgt:161cm\n" +
            "cid:210 ecl:#793ac0\n" +
            "pid:480283173\n" +
            "iyr:2019 byr:1967\n" +
            "\n" +
            "cid:82 ecl:amb iyr:2017 eyr:2023 byr:1980 hgt:59in hcl:#888785 pid:323524654\n" +
            "\n" +
            "hcl:#341e13 hgt:154cm\n" +
            "iyr:2015 eyr:2023\n" +
            "byr:1953 ecl:blu pid:872964523\n" +
            "\n" +
            "iyr:2019\n" +
            "byr:1945 hcl:#efcc98\n" +
            "hgt:155in\n" +
            "ecl:#1608c7 eyr:2030 pid:406045604\n" +
            "\n" +
            "ecl:lzr byr:2015 iyr:1938\n" +
            "eyr:2026 hcl:z\n" +
            "pid:542894703 hgt:185\n" +
            "\n" +
            "eyr:2021 hcl:#cfa07d ecl:hzl hgt:82\n" +
            "iyr:2018 byr:1932\n" +
            "pid:661993261\n" +
            "\n" +
            "ecl:brn hcl:#602927\n" +
            "hgt:193cm pid:572216250\n" +
            "byr:1929 eyr:2020 iyr:2010 cid:206\n" +
            "\n" +
            "ecl:amb\n" +
            "eyr:2025\n" +
            "pid:932260335 byr:1978 iyr:2012\n" +
            "hcl:#cfa07d\n" +
            "cid:260 hgt:67in\n" +
            "\n" +
            "pid:635410614\n" +
            "byr:1948 hgt:156cm hcl:#071bc0 eyr:2026\n" +
            "ecl:grn\n" +
            "cid:275\n" +
            "iyr:2014\n" +
            "\n" +
            "hcl:#8a4888 byr:1986\n" +
            "iyr:2010 ecl:amb cid:113\n" +
            "pid:974757414 hgt:174cm\n" +
            "eyr:2024\n" +
            "\n" +
            "byr:1934 ecl:amb iyr:2016\n" +
            "pid:280206549 hgt:176cm\n" +
            "eyr:2020 hcl:#fffffd\n" +
            "\n" +
            "pid:544634927\n" +
            "eyr:2021 hgt:188cm byr:1947 iyr:2020\n" +
            "hcl:#008716 ecl:oth\n" +
            "cid:97\n" +
            "\n" +
            "eyr:2026 pid:863010622\n" +
            "byr:1978 hcl:#b6652a hgt:157cm cid:323 iyr:2020 ecl:blu\n" +
            "\n" +
            "cid:105\n" +
            "byr:1926\n" +
            "hcl:#6b5442 pid:049198636 eyr:2026 hgt:75in\n" +
            "iyr:2018 ecl:blu\n" +
            "\n" +
            "eyr:2038 hgt:76cm byr:2020 pid:9036865757 iyr:2025\n" +
            "ecl:#a2c975\n" +
            "hcl:z\n" +
            "cid:340\n" +
            "\n" +
            "pid:425619875 cid:263 byr:1935\n" +
            "eyr:2028 hgt:192cm iyr:2010 hcl:#a6ddfc ecl:hzl\n" +
            "\n" +
            "cid:107 hgt:189cm\n" +
            "hcl:#733820 ecl:blu\n" +
            "eyr:2028 iyr:2020 pid:814895947\n" +
            "\n" +
            "cid:96 hgt:74in\n" +
            "hcl:z\n" +
            "pid:170cm ecl:#0240fd byr:2004 iyr:2013 eyr:1936\n" +
            "\n" +
            "ecl:blu\n" +
            "eyr:2027 hcl:#341e13\n" +
            "iyr:2020\n" +
            "cid:94\n" +
            "hgt:174cm\n" +
            "\n" +
            "iyr:2013 ecl:amb\n" +
            "eyr:2030 hcl:#b6652a\n" +
            "byr:1964\n" +
            "pid:329942894\n" +
            "\n" +
            "byr:1995 ecl:hzl eyr:2030\n" +
            "hgt:177cm hcl:#341e13\n" +
            "cid:64\n" +
            "\n" +
            "eyr:2027 pid:708191313\n" +
            "ecl:#390609 byr:2022 iyr:2010 cid:292 hgt:129\n" +
            "hcl:#733820\n" +
            "\n" +
            "hcl:#733820 ecl:hzl eyr:2030\n" +
            "iyr:2011\n" +
            "hgt:156cm\n" +
            "byr:2002 pid:932464949\n" +
            "\n" +
            "iyr:1941\n" +
            "byr:2027 ecl:xry eyr:1949 pid:82479270\n" +
            "hgt:175 hcl:z\n" +
            "cid:157\n" +
            "\n" +
            "byr:1927 pid:708954312 eyr:2028 ecl:oth hgt:167cm hcl:#602927 iyr:2011\n" +
            "\n" +
            "cid:125 eyr:2034 iyr:2030\n" +
            "hgt:116 byr:2030\n" +
            "hcl:f773ce pid:#d24ed1 ecl:lzr\n" +
            "\n" +
            "hcl:#efcc98 byr:1947 pid:423105162 ecl:brn iyr:2019 hgt:154cm\n" +
            "eyr:2026\n" +
            "cid:174\n" +
            "\n" +
            "iyr:2017\n" +
            "ecl:gry\n" +
            "hcl:#341e13\n" +
            "pid:314487906 eyr:2038 hgt:171cm byr:2014\n" +
            "\n" +
            "pid:630479640 ecl:brn hgt:163cm\n" +
            "iyr:2013 eyr:2028 byr:1998 hcl:#866857\n" +
            "\n" +
            "iyr:2013 hcl:z byr:2016\n" +
            "ecl:#43d879 pid:996281170\n" +
            "cid:200 hgt:153 eyr:2030\n" +
            "\n" +
            "byr:2023\n" +
            "pid:081908248 iyr:2020\n" +
            "eyr:2035\n" +
            "hgt:175in ecl:grt hcl:30ab42\n" +
            "\n" +
            "iyr:2018 byr:1995 eyr:2029 ecl:grn pid:882123182 hgt:62cm hcl:#fffffd\n" +
            "\n" +
            "byr:1978 hcl:z\n" +
            "iyr:1923 ecl:blu eyr:2037 pid:#1f3467 hgt:186cm\n" +
            "\n" +
            "cid:264 ecl:#ab07c5 iyr:1927 hcl:2d6f9c\n" +
            "hgt:74cm byr:2008 pid:874594495 eyr:2035\n" +
            "\n" +
            "ecl:lzr hgt:69cm\n" +
            "hcl:76854c cid:336 pid:7830555583\n" +
            "iyr:1920\n" +
            "byr:2021 eyr:2038\n" +
            "\n" +
            "hgt:160cm byr:2029 ecl:#7f9d1b hcl:z iyr:1975\n" +
            "pid:652466273\n" +
            "eyr:2031\n" +
            "\n" +
            "ecl:oth\n" +
            "eyr:2027 iyr:2019 pid:544347482\n" +
            "byr:1988 hgt:182cm hcl:#cfa07d\n" +
            "\n" +
            "hgt:176cm iyr:2016 hcl:ec1dc3\n" +
            "pid:521230755 byr:2030 ecl:amb eyr:2025\n" +
            "\n" +
            "pid:005216805 byr:1951\n" +
            "ecl:hzl hcl:#efcc98 eyr:2022\n" +
            "iyr:2016\n" +
            "hgt:154cm\n" +
            "\n" +
            "byr:1943 hcl:#866857\n" +
            "eyr:1984 hgt:64cm\n" +
            "pid:3105984 iyr:1997\n" +
            "ecl:lzr\n" +
            "\n" +
            "eyr:2024\n" +
            "byr:1931 pid:929699878 hgt:169cm cid:81 hcl:#efcc98\n" +
            "\n" +
            "iyr:2011 pid:558972589\n" +
            "hgt:163cm cid:155 eyr:2025 byr:1952 ecl:oth\n" +
            "hcl:#c0946f\n" +
            "\n" +
            "pid:787560595 eyr:2036\n" +
            "hcl:#888785 byr:1999 iyr:1971 ecl:blu\n" +
            "\n" +
            "hgt:165in pid:032310066\n" +
            "eyr:1926 byr:1954 ecl:brn hcl:41964f iyr:2023\n" +
            "\n" +
            "hcl:#733820\n" +
            "pid:563740385\n" +
            "hgt:184cm\n" +
            "iyr:1959\n" +
            "ecl:gmt cid:242 byr:1999\n" +
            "\n" +
            "pid:4949046383 byr:2011 hcl:fcf63b\n" +
            "ecl:hzl\n" +
            "hgt:174in\n" +
            "iyr:2023 eyr:1939\n" +
            "\n" +
            "cid:331\n" +
            "ecl:grt hcl:z eyr:2003 hgt:172in byr:2012 iyr:1954 pid:#9f4663\n" +
            "\n" +
            "cid:223 byr:1939 eyr:2025\n" +
            "ecl:oth hgt:161cm iyr:2015 pid:214576789 hcl:#866857\n" +
            "\n" +
            "ecl:oth pid:912009529 byr:1968 hgt:161cm\n" +
            "hcl:#ceb3a1 eyr:2023 iyr:2017\n" +
            "\n" +
            "pid:858541281 hgt:150cm eyr:2021\n" +
            "iyr:2013 ecl:gry\n" +
            "hcl:#fffffd byr:1959\n" +
            "\n" +
            "ecl:#0024e0 byr:2006 cid:107\n" +
            "iyr:2015 hcl:684416 hgt:94 pid:152cm eyr:2031\n" +
            "\n" +
            "byr:1987 hcl:z\n" +
            "ecl:gry pid:#246fe1 hgt:65cm eyr:1992 iyr:2020\n" +
            "\n" +
            "pid:426999585\n" +
            "ecl:hzl byr:1949 hcl:#888785 hgt:191cm\n" +
            "iyr:2020 eyr:2020\n" +
            "\n" +
            "byr:1951 hcl:#623a2f\n" +
            "cid:308 ecl:hzl\n" +
            "hgt:174cm pid:226138254\n" +
            "eyr:2028\n" +
            "iyr:2018\n" +
            "\n" +
            "ecl:brn hgt:62in\n" +
            "eyr:2020 hcl:#ceb3a1 pid:650916481\n" +
            "byr:1940\n" +
            "iyr:2018\n" +
            "\n" +
            "hcl:#efcc98 ecl:brn\n" +
            "byr:1940 eyr:2024 pid:#68d3ab\n" +
            "hgt:177cm cid:83\n" +
            "iyr:2017\n" +
            "\n" +
            "pid:9704738756 hcl:#fffffd eyr:1925\n" +
            "iyr:2019 byr:1929 ecl:blu hgt:191cm\n" +
            "\n" +
            "ecl:brn hgt:151cm hcl:#c0946f iyr:2018 pid:602505609 eyr:2020\n" +
            "byr:1974\n" +
            "\n" +
            "hgt:178cm\n" +
            "eyr:2023 byr:1922\n" +
            "iyr:2013\n" +
            "hcl:#fffffd pid:205291054 ecl:blu\n" +
            "\n" +
            "byr:1985\n" +
            "iyr:2016 hcl:#ceb3a1 hgt:161cm eyr:2030 ecl:amb\n" +
            "pid:871809978\n" +
            "\n" +
            "iyr:2027 ecl:#d9c9cb hgt:110\n" +
            "eyr:2034\n" +
            "hcl:99d4ee pid:13355969 cid:168\n" +
            "\n" +
            "ecl:utc byr:2019\n" +
            "iyr:2016 hgt:173in cid:266\n" +
            "hcl:z eyr:2033\n" +
            "pid:1835189643\n" +
            "\n" +
            "pid:364874100 ecl:amb hcl:#6b5442 hgt:184cm\n" +
            "iyr:2017 eyr:2026 byr:1920 cid:127\n" +
            "\n" +
            "ecl:dne eyr:2020\n" +
            "byr:2018 cid:262\n" +
            "iyr:2010 hgt:60cm\n" +
            "pid:95409983 hcl:z\n" +
            "\n" +
            "eyr:2026\n" +
            "pid:135963889 iyr:2018 hcl:#ceb3a1\n" +
            "ecl:amb\n" +
            "\n" +
            "hcl:#341e13 eyr:2028 iyr:2014 byr:1978\n" +
            "cid:309\n" +
            "pid:503628987\n" +
            "ecl:oth hgt:159cm\n" +
            "\n" +
            "hcl:#a97842\n" +
            "pid:171194014 hgt:193cm eyr:2023\n" +
            "byr:1945 ecl:grt\n" +
            "iyr:2019\n" +
            "\n" +
            "eyr:1967 cid:135 hcl:z\n" +
            "ecl:gmt\n" +
            "iyr:2024 pid:#a87744\n" +
            "byr:2023 hgt:168cm\n" +
            "\n" +
            "pid:169cm\n" +
            "cid:337 ecl:hzl hcl:#888785 byr:1927 hgt:153cm\n" +
            "iyr:2022 eyr:2020\n" +
            "\n" +
            "byr:1963 hcl:#fffffd eyr:2021\n" +
            "hgt:62in pid:702188504 iyr:2013\n" +
            "ecl:hzl\n" +
            "\n" +
            "iyr:2024 ecl:amb hcl:#ceb3a1\n" +
            "eyr:2017 pid:49752568 hgt:179cm byr:1938\n" +
            "\n" +
            "byr:2006\n" +
            "ecl:#08021a\n" +
            "eyr:2022 pid:520309937\n" +
            "hgt:61in hcl:#ceb3a1\n" +
            "iyr:2013\n" +
            "\n" +
            "hgt:150cm hcl:#733820 byr:1971 ecl:zzz cid:347\n" +
            "iyr:2020 eyr:2020 pid:6028818045\n" +
            "\n" +
            "byr:2005 hgt:69cm\n" +
            "ecl:lzr hcl:z iyr:2009 eyr:2038 pid:79626157\n" +
            "\n" +
            "iyr:2020 byr:2015 pid:882923693 hcl:#888785 eyr:2030\n" +
            "ecl:xry hgt:65in\n" +
            "\n" +
            "hcl:z hgt:187cm pid:4397913655 iyr:1973 eyr:1925\n" +
            "ecl:#93ae1a\n" +
            "\n" +
            "hgt:169cm\n" +
            "iyr:2019 eyr:2023 pid:678937529\n" +
            "ecl:blu byr:1998 hcl:#fffffd\n" +
            "\n" +
            "cid:87 hcl:#efcc98\n" +
            "ecl:#e56390\n" +
            "iyr:2013 hgt:191in\n" +
            "eyr:2027 pid:923358773 byr:1960\n" +
            "\n" +
            "hgt:190cm byr:1939\n" +
            "cid:55 eyr:2026 ecl:blu hcl:#623a2f pid:363917612\n" +
            "iyr:2012\n" +
            "\n" +
            "pid:177cm hgt:165cm cid:276 eyr:2002 byr:2010 hcl:#7bea4c iyr:2017\n" +
            "ecl:grt\n" +
            "\n" +
            "byr:2023 eyr:2031\n" +
            "iyr:1987 hgt:172 hcl:z\n" +
            "pid:4973557135 ecl:#7517e2\n" +
            "\n" +
            "eyr:2036 iyr:1989 ecl:#ef5492 hgt:188in pid:#b50065\n" +
            "hcl:92e9ee byr:2015\n" +
            "\n" +
            "pid:873654822 iyr:2016 cid:310\n" +
            "hgt:76in\n" +
            "eyr:2029 hcl:#888785 byr:1958\n" +
            "ecl:brn\n" +
            "\n" +
            "iyr:2013 ecl:amb byr:2024\n" +
            "hgt:166cm\n" +
            "cid:221 eyr:2040 pid:358648642 hcl:#733820\n" +
            "\n" +
            "hgt:181cm cid:295 ecl:blu eyr:2027\n" +
            "iyr:2016\n" +
            "byr:1932\n" +
            "hcl:#2502ba\n" +
            "pid:177357899\n" +
            "\n" +
            "pid:154588649 eyr:2028\n" +
            "byr:1945 iyr:2020\n" +
            "ecl:amb cid:220\n" +
            "hgt:189cm hcl:#a97842\n" +
            "\n" +
            "iyr:2011\n" +
            "eyr:2030 cid:143 byr:1998 pid:403108989\n" +
            "ecl:oth hcl:#6b5442\n" +
            "hgt:151cm\n" +
            "\n" +
            "pid:071042426 cid:217 iyr:2017 ecl:grn byr:1989 eyr:2026 hgt:193cm hcl:#7d3b0c\n" +
            "\n" +
            "eyr:2025\n" +
            "iyr:2025 pid:3942412883 hcl:#cfa07d cid:237 ecl:utc hgt:182\n" +
            "\n" +
            "iyr:2012 eyr:1982 byr:2029 pid:8573047090\n" +
            "hgt:159in ecl:#1e0124 hcl:#b6652a\n" +
            "\n" +
            "hcl:53c64f ecl:gmt iyr:1984 byr:2029\n" +
            "hgt:59cm\n" +
            "pid:#106076 eyr:2031\n" +
            "\n" +
            "hcl:#733820 iyr:2019\n" +
            "eyr:2031\n" +
            "pid:706963298\n" +
            "hgt:134\n" +
            "byr:2004\n" +
            "\n" +
            "byr:2012 cid:161\n" +
            "eyr:2039 ecl:gry hgt:61cm iyr:1949 pid:870113802 hcl:z\n" +
            "\n" +
            "byr:1961 eyr:2023 pid:353075198 iyr:2020 hcl:#888785 ecl:oth\n" +
            "hgt:163cm\n" +
            "\n" +
            "byr:2001 iyr:2015\n" +
            "hgt:159cm hcl:#623a2f ecl:#3303fc\n" +
            "pid:86352609 eyr:2030\n" +
            "\n" +
            "pid:392475721 ecl:brn byr:1927 iyr:2014 eyr:2024 hcl:#fffffd\n" +
            "\n" +
            "hgt:160cm eyr:2022 byr:1979 iyr:2010\n" +
            "pid:974489456\n" +
            "hcl:#efcc98\n" +
            "\n" +
            "ecl:grn eyr:2024\n" +
            "hgt:166cm byr:1961\n" +
            "pid:221051556\n" +
            "hcl:#6b5442\n" +
            "iyr:2028\n" +
            "\n" +
            "iyr:2010 cid:156\n" +
            "byr:2005 hgt:155cm ecl:amb eyr:1988\n" +
            "hcl:#866857\n" +
            "pid:169cm\n" +
            "\n" +
            "eyr:2038 byr:1991 pid:#9b82ce\n" +
            "iyr:2027 hcl:z\n" +
            "cid:278 hgt:59cm ecl:#179d81\n" +
            "\n" +
            "ecl:blu hgt:151cm\n" +
            "iyr:2013\n" +
            "cid:117 pid:129843687 hcl:#c429e7 byr:1961\n" +
            "eyr:2022\n" +
            "\n" +
            "hcl:#602927 byr:1996 pid:507775673 eyr:2020 hgt:153cm ecl:oth\n" +
            "cid:251 iyr:2010\n" +
            "\n" +
            "hgt:170cm ecl:oth iyr:2010 eyr:2025 hcl:#602927 byr:1983 pid:113809908\n" +
            "\n" +
            "hcl:#c0946f pid:172142380\n" +
            "iyr:2017 byr:1926\n" +
            "hgt:190cm eyr:2028\n" +
            "ecl:brn\n" +
            "\n" +
            "pid:812443511 hcl:#6b5442 eyr:2021 ecl:amb\n" +
            "cid:60 iyr:2017 hgt:157cm byr:1926\n" +
            "\n" +
            "hgt:177cm\n" +
            "ecl:gry eyr:2022 hcl:#888785 pid:570572334 byr:1943 iyr:2017\n" +
            "\n" +
            "pid:#967cbc hcl:z byr:2020 ecl:oth eyr:2035 iyr:2015\n" +
            "cid:99 hgt:65cm\n" +
            "\n" +
            "iyr:2019 pid:285935311 hcl:#4c1ee4 byr:1954 eyr:2028 hgt:157cm\n" +
            "\n" +
            "ecl:xry eyr:1939\n" +
            "pid:192cm\n" +
            "hgt:114\n" +
            "hcl:b97555 byr:2004 iyr:1970\n" +
            "\n" +
            "ecl:grn byr:2021 iyr:2030\n" +
            "hcl:z pid:305489303 hgt:61cm eyr:2020\n" +
            "\n" +
            "eyr:2036 hgt:179cm\n" +
            "pid:#8be5f5 byr:1981\n" +
            "hcl:#cb5848 iyr:2015\n" +
            "\n" +
            "iyr:2011 ecl:oth hgt:176cm cid:344 pid:539941547 hcl:#efcc98\n" +
            "\n" +
            "eyr:1987 ecl:amb\n" +
            "byr:2029 pid:046017350\n" +
            "cid:182 iyr:2011 hcl:z hgt:191cm\n" +
            "\n" +
            "iyr:2019 byr:1948 eyr:2020 ecl:hzl hgt:176cm hcl:#733820 pid:235101182\n" +
            "\n" +
            "ecl:hzl\n" +
            "eyr:2029 pid:262843012 hgt:76in hcl:#efcc98 iyr:2015 byr:1931\n" +
            "\n" +
            "iyr:2011 ecl:blu hgt:184cm\n" +
            "byr:1945\n" +
            "hcl:#c0946f pid:105042852\n" +
            "\n" +
            "iyr:2010\n" +
            "pid:485638522 hcl:949a37 eyr:2030\n" +
            "hgt:193cm\n" +
            "ecl:gry byr:2021\n" +
            "\n" +
            "pid:565896801 eyr:2029 hcl:#fffffd ecl:amb iyr:2016 byr:1977\n" +
            "hgt:170cm\n" +
            "\n" +
            "byr:1987\n" +
            "hcl:#c0946f pid:931311386\n" +
            "iyr:2010 eyr:2022\n" +
            "\n" +
            "eyr:2030\n" +
            "hgt:177cm hcl:#a97842 byr:1978\n" +
            "ecl:hzl pid:358177000\n" +
            "iyr:2014\n" +
            "\n" +
            "iyr:2025\n" +
            "pid:3639383157 cid:82 hcl:f2aec0 hgt:179cm\n" +
            "eyr:1944 byr:1969\n" +
            "ecl:#e167d3\n" +
            "\n" +
            "hgt:107 ecl:gmt iyr:2030 hcl:#866857 byr:2026 eyr:1990 pid:#87773e\n" +
            "\n" +
            "cid:220 hcl:z iyr:1921 hgt:65cm byr:1998 ecl:#34397f eyr:2035\n" +
            "\n" +
            "hcl:44e552 pid:#6f341e ecl:#59aeb1\n" +
            "eyr:1926 hgt:187 iyr:1988\n" +
            "byr:1991\n" +
            "\n" +
            "hcl:z hgt:70cm pid:653386115 iyr:1964 byr:2026 cid:103\n" +
            "ecl:#b81c45 eyr:2034\n" +
            "\n" +
            "hcl:#623a2f cid:307 pid:204266921 hgt:172cm\n" +
            "iyr:2012\n" +
            "ecl:hzl\n" +
            "eyr:2021\n" +
            "byr:1984\n" +
            "\n" +
            "hgt:192cm\n" +
            "byr:1930 pid:39349843 hcl:#866857 iyr:2013 cid:130 ecl:blu eyr:1962\n" +
            "\n" +
            "cid:97 eyr:2036 pid:#279c0b ecl:dne hgt:186in iyr:1973 hcl:691266\n" +
            "\n" +
            "byr:2026 hgt:185cm hcl:z ecl:grt pid:#562f7a eyr:1986 iyr:2029\n" +
            "\n" +
            "ecl:brn\n" +
            "hcl:#b6652a eyr:2028\n" +
            "pid:570023672\n" +
            "byr:1988 hgt:162cm iyr:2015\n" +
            "\n" +
            "hgt:180in ecl:zzz hcl:5b1477 byr:2024\n" +
            "eyr:2028\n" +
            "pid:#b03174\n" +
            "\n" +
            "pid:157cm eyr:1989 hgt:188cm\n" +
            "iyr:2015\n" +
            "hcl:3362a9 ecl:gry byr:2027\n" +
            "\n" +
            "pid:111584950\n" +
            "byr:1941 ecl:grn iyr:2013 hgt:179cm hcl:#866857\n" +
            "eyr:2024\n" +
            "\n" +
            "ecl:#7f4baa\n" +
            "iyr:2015 hcl:de1367\n" +
            "eyr:2024 byr:1959\n" +
            "pid:#cf4e78 hgt:60cm\n" +
            "\n" +
            "byr:2024 eyr:1953 pid:21579220\n" +
            "hgt:179\n" +
            "cid:94\n" +
            "hcl:#a97842\n" +
            "iyr:1977 ecl:xry\n" +
            "\n" +
            "hgt:179cm eyr:2020\n" +
            "ecl:hzl hcl:#efcc98\n" +
            "pid:905622096 byr:1929\n" +
            "\n" +
            "ecl:oth\n" +
            "byr:2001 eyr:2008 iyr:2020\n" +
            "hcl:#ceb3a1 pid:244298637 hgt:160cm\n" +
            "\n" +
            "eyr:2030\n" +
            "byr:1972 hcl:#341e13\n" +
            "ecl:grn iyr:2014 pid:274475554 hgt:71in\n" +
            "\n" +
            "byr:1938 hcl:z iyr:1956 pid:153cm hgt:62cm ecl:grt\n" +
            "eyr:2036\n" +
            "\n" +
            "hgt:177cm cid:276 iyr:1921 hcl:19aa96 pid:843799864 eyr:2033\n" +
            "ecl:#812d68\n" +
            "\n" +
            "pid:686496844\n" +
            "ecl:brn hcl:#733820\n" +
            "byr:1948 iyr:2010 eyr:2020\n" +
            "hgt:164cm\n" +
            "\n" +
            "pid:39436322 ecl:blu hcl:25b3d4 hgt:185in\n" +
            "iyr:2019 byr:1959 eyr:2022\n" +
            "\n" +
            "pid:119603708 hcl:#866857 byr:1983 hgt:157cm iyr:1978 ecl:hzl eyr:1945\n" +
            "\n" +
            "cid:331 hcl:z iyr:2017\n" +
            "pid:255988517\n" +
            "byr:2015\n" +
            "eyr:2020 ecl:amb\n" +
            "hgt:171\n" +
            "\n" +
            "hgt:180cm iyr:2013 ecl:brn\n" +
            "hcl:#602927 byr:1943\n" +
            "pid:898265221 eyr:2025\n" +
            "\n" +
            "eyr:2024\n" +
            "hgt:163cm\n" +
            "pid:892793767 byr:1971 ecl:oth iyr:2013 cid:119 hcl:#02f6b3\n" +
            "\n" +
            "byr:1920 cid:221\n" +
            "pid:#7515a7 hgt:160in\n" +
            "eyr:1921 iyr:1983 hcl:z\n" +
            "\n" +
            "byr:2029 hcl:z hgt:75cm eyr:1975 pid:184cm iyr:1992 ecl:dne\n" +
            "\n" +
            "iyr:1990\n" +
            "hgt:174in eyr:1961 ecl:brn\n" +
            "hcl:#a3313e byr:2029\n" +
            "\n" +
            "hgt:191cm eyr:2026 iyr:2019 ecl:brn\n" +
            "byr:1930 hcl:#7d3b0c cid:174\n" +
            "\n" +
            "ecl:amb iyr:2015 hgt:163cm\n" +
            "pid:664966673 hcl:#602927 eyr:2026 cid:229 byr:1941\n" +
            "\n" +
            "pid:3123244013 eyr:2037 iyr:2022 hcl:103dfa\n" +
            "hgt:156cm byr:2027 ecl:gmt cid:195\n" +
            "\n" +
            "cid:151 ecl:blu pid:693382940\n" +
            "iyr:2011 byr:1954\n" +
            "hgt:170cm eyr:2030 hcl:#866857\n" +
            "\n" +
            "hcl:#341e13 eyr:2023 byr:1948 iyr:2010 pid:607929427\n" +
            "ecl:oth hgt:160cm\n" +
            "\n" +
            "hcl:#c0946f\n" +
            "ecl:brn\n" +
            "hgt:189cm\n" +
            "cid:116 iyr:2013 pid:277606931\n" +
            "byr:1975\n" +
            "\n" +
            "eyr:2027\n" +
            "cid:206 ecl:gry iyr:2010 hcl:#866857 byr:1997 hgt:190cm pid:687577894\n" +
            "\n" +
            "eyr:2029 iyr:2015 pid:681485527\n" +
            "byr:1925 hgt:152cm\n" +
            "ecl:amb hcl:#341e13\n" +
            "\n" +
            "eyr:2030\n" +
            "hcl:#c396d9\n" +
            "hgt:159cm pid:686268817\n" +
            "ecl:brn byr:1983\n" +
            "iyr:2017\n" +
            "\n" +
            "eyr:2038 byr:2012\n" +
            "cid:303\n" +
            "iyr:1941 hcl:z ecl:utc pid:203595168\n" +
            "hgt:71cm\n" +
            "\n" +
            "pid:863355278 hcl:#888785\n" +
            "iyr:2018\n" +
            "byr:1953 eyr:2022 hgt:167cm\n" +
            "ecl:amb\n" +
            "\n" +
            "pid:141244310 eyr:2025 hcl:#733820 ecl:amb hgt:154cm cid:61 iyr:2017\n" +
            "byr:1929\n" +
            "\n" +
            "pid:361065637\n" +
            "hcl:#623a2f byr:1964 iyr:2015 eyr:2027 ecl:gry hgt:67in\n" +
            "\n" +
            "cid:117 ecl:brn iyr:2025 byr:1982\n" +
            "hcl:#ceb3a1 hgt:185cm\n" +
            "pid:34652522\n" +
            "\n" +
            "cid:275 ecl:#7a4722 eyr:2001 byr:2018 iyr:1995\n" +
            "hgt:105\n" +
            "pid:95250112 hcl:z\n" +
            "\n" +
            "iyr:2017 ecl:amb hgt:152cm hcl:#733820 cid:57 eyr:2020 pid:701621326\n" +
            "byr:1944\n" +
            "\n" +
            "hcl:#18171d\n" +
            "ecl:brn iyr:2015 hgt:175cm eyr:2028 pid:311636591 cid:113\n" +
            "byr:1979\n" +
            "\n" +
            "ecl:grn\n" +
            "hgt:185cm\n" +
            "pid:920998407 iyr:2016 byr:1930 eyr:2029 hcl:#7d3b0c\n" +
            "\n" +
            "iyr:2021 eyr:1931\n" +
            "hcl:z byr:2010\n" +
            "hgt:177in\n" +
            "pid:#cfb659 ecl:zzz\n" +
            "\n" +
            "cid:171 hcl:#888785 iyr:2010 byr:1970 ecl:hzl\n" +
            "pid:141430645 hgt:160cm\n" +
            "eyr:2026\n" +
            "\n" +
            "hgt:172cm ecl:gry\n" +
            "pid:428207256 cid:237 hcl:#733820 iyr:2012\n" +
            "eyr:2027 byr:1951\n" +
            "\n" +
            "hgt:70cm cid:76 ecl:#c544c3 byr:2019\n" +
            "pid:6133497812\n" +
            "hcl:#efcc98\n" +
            "eyr:2037 iyr:2015\n" +
            "\n" +
            "hgt:176in pid:582383714 byr:1980 ecl:amb hcl:08097e iyr:2020 eyr:2021\n" +
            "\n" +
            "ecl:oth\n" +
            "eyr:2024\n" +
            "hgt:176cm byr:1923\n" +
            "iyr:2014 pid:737058734\n" +
            "hcl:#b6652a cid:203\n" +
            "\n" +
            "ecl:amb\n" +
            "eyr:2029\n" +
            "hgt:186cm\n" +
            "pid:440986981 iyr:2010 hcl:#cfa07d\n" +
            "byr:1967\n" +
            "\n" +
            "pid:8729818647 hcl:z\n" +
            "ecl:#ae70eb cid:168 hgt:161cm iyr:2030\n" +
            "eyr:2020 byr:2022\n" +
            "\n" +
            "hcl:#43a092 hgt:165cm byr:1961\n" +
            "pid:026098019\n" +
            "iyr:2019 eyr:2020 ecl:amb\n" +
            "\n" +
            "cid:154 hgt:192cm\n" +
            "eyr:2016 iyr:2030\n" +
            "ecl:brn pid:#8e0762 byr:2020\n" +
            "\n" +
            "hgt:175cm ecl:brn byr:1944\n" +
            "pid:553456151 iyr:2016 eyr:2027 hcl:#085f41\n" +
            "\n" +
            "ecl:gry\n" +
            "byr:1975 eyr:2025 cid:122 pid:111078821\n" +
            "hcl:#b6652a iyr:2015\n" +
            "hgt:151cm\n" +
            "\n" +
            "hgt:159cm pid:946458516 eyr:2020 hcl:#a97842 byr:1972\n" +
            "iyr:2016 cid:88 ecl:oth\n" +
            "\n" +
            "eyr:2023\n" +
            "cid:156\n" +
            "byr:1999\n" +
            "hgt:186cm hcl:#fffffd pid:499141155\n" +
            "ecl:grn\n" +
            "\n" +
            "hcl:#888785 hgt:165cm pid:864544116\n" +
            "ecl:gry byr:1937\n" +
            "iyr:2020 eyr:2026\n" +
            "\n" +
            "hgt:155cm\n" +
            "iyr:2018 ecl:blu\n" +
            "hcl:#a97842\n" +
            "byr:1994 eyr:2024\n" +
            "\n" +
            "eyr:2021 iyr:2019 hgt:175cm cid:127 byr:1982 hcl:#888785 ecl:amb\n" +
            "\n" +
            "eyr:2022 iyr:2011 ecl:blu\n" +
            "pid:202081532 hcl:z hgt:177in byr:1923\n" +
            "\n" +
            "iyr:2017 cid:213 hcl:#fffffd\n" +
            "ecl:hzl\n" +
            "hgt:193cm pid:564823661 byr:1966 eyr:2030\n" +
            "\n" +
            "hcl:#623a2f iyr:2014 hgt:177cm byr:1950 ecl:amb\n" +
            "cid:290 eyr:2025 pid:669369557\n" +
            "\n" +
            "hgt:67cm\n" +
            "eyr:2028 ecl:brn\n" +
            "hcl:411b18 pid:222472243\n" +
            "\n" +
            "byr:1981 ecl:gry hcl:#b6652a eyr:2033 iyr:1943 pid:832989613 hgt:167cm\n" +
            "\n" +
            "byr:1970\n" +
            "cid:172 hcl:#64fbcb eyr:2007\n" +
            "ecl:hzl pid:982450142\n" +
            "hgt:61cm iyr:2019\n" +
            "\n" +
            "eyr:2025\n" +
            "hgt:161cm iyr:1962\n" +
            "pid:394421140\n" +
            "ecl:gry\n" +
            "cid:209 hcl:#efcc98 byr:2001";

    static boolean isStringValidPassport(String passportInfo) {
        boolean isIt = false;
        if (passportInfo.contains("byr") &&
                passportInfo.contains("iyr") &&
                passportInfo.contains("eyr") &&
                passportInfo.contains("hgt") &&
                passportInfo.contains("hcl") &&
                passportInfo.contains("ecl") &&
                passportInfo.contains("pid")
        ) {
            isIt = true;
        }
        return isIt;
    }

    public static void solutionPartOne(String[] inputs) {
        int counter = 0;
        int counterNegative = 0;
        for (String document :
                inputs) {
            if (isStringValidPassport(document)) {
                counter++;
            } else counterNegative++;
        }
        System.out.println(counter);
        System.out.println(counterNegative);
    }

    static boolean isByrValid(String byr) {
        int value = Integer.parseInt(byr);
        return value >= 1920 && value <= 2002;
    }

    static boolean isIyrValid(String iyr) {
        int value = Integer.parseInt(iyr);
        return value >= 2010 && value <= 2020;
    }

    static boolean isEyrValid(String eyr) {
        int value = Integer.parseInt(eyr);
        return value >= 2020 && value <= 2030;
    }

    static boolean isHgtValid(String hgt) {
        int value = Integer.parseInt(hgt.replaceAll("[a-zA-Z]+", ""));
        if (hgt.contains("cm")) {
            return value >=150 && value<=193;
        } else if (hgt.contains("in")) {
            return value >=59 && value<=76;
        } else return false;
    }

    static boolean isHclValid(String hcl) {
        final String HEX_COLOR_PATTERN = "^#([a-fA-F0-9]{6})$";
        final Pattern pattern = Pattern.compile(HEX_COLOR_PATTERN);

        Matcher matcher = pattern.matcher(hcl);
        return matcher.matches();
    }

    static boolean isEclValid(String ecl) {
        return ecl.equalsIgnoreCase("amb")
        || ecl.equalsIgnoreCase("blu") ||  ecl.equalsIgnoreCase("brn") ||
                ecl.equalsIgnoreCase("gry") || ecl.equalsIgnoreCase("grn") ||
                ecl.equalsIgnoreCase("hzl") || ecl.equalsIgnoreCase("oth");
    }

    static boolean isPidValid (String pid) {
        return pid.length() == 9;
    }

    static boolean isPassportInfoValid(String byr, String iyr, String eyr, String hgt, String hcl, String ecl, String pid){
        return isPidValid(pid) && isHgtValid(hgt) && isByrValid(byr) && isEclValid(ecl) && isEyrValid(eyr) && isHclValid(hcl)
                && isIyrValid(iyr);
    }

    static HashMap<String, String> passportKeyValue(String passportInfo) {
        HashMap<String, String> temp = new HashMap<String, String>();
        String temporal = passportInfo.replaceAll("\n", " ");
        String[] attributes = temporal.split(" ");
        for (String attribute :
                attributes) {
            String[] keyValue = attribute.split(":");
            temp.put(keyValue[0], keyValue[1]);
        }
        return temp;
    }
    static int counter = 0;
    static int negativeCounter = 0;

    public static void solutionPartTwo(String passportInfo) {
        if (isStringValidPassport(passportInfo)) {
            HashMap<String, String> hashMap = passportKeyValue(passportInfo);
            if (isPassportInfoValid(hashMap.get("byr"), hashMap.get("iyr"), hashMap.get("eyr"), hashMap.get("hgt"), hashMap.get("hcl"), hashMap.get("ecl"), hashMap.get("pid"))) {
                counter++;
            } else negativeCounter++;
        } else negativeCounter ++;
    }

    public static void main(String[] args) {
        String[] strings = inputs.split("\\n\\n");
        for (String inputRecord :
                strings) {
            solutionPartTwo(inputRecord);
        }
        System.out.println(counter);
        System.out.println(negativeCounter);
    }
}
