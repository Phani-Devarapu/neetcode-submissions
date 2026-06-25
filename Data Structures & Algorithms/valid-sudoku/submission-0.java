class Solution {
    public boolean isValidSudoku(char[][] arr) {

           Map<String, Set<Character>> map = new HashMap<>();
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                char ele = arr[row][col];

                if (ele == '.') {
                    continue;
                }

                //row validation
                String rowKey = row + "_" + "R";
                map.putIfAbsent(rowKey, new HashSet<>());
                Set<Character> characters = map.get(rowKey);
                if (characters.contains(ele)) {
                    return false;
                } else {
                    characters.add(ele);
                    map.put(rowKey, characters);
                }

                //column validation
                String colKey = col + "_" + "C";
                map.putIfAbsent(colKey, new HashSet<>());
                Set<Character> colChars = map.get(colKey);
                if (colChars.contains(ele)) {
                    return false;
                } else {
                    colChars.add(ele);
                    map.put(colKey, colChars);
                }

                //sqaure validation
                int sqNum = (row / 3) * 3 + col / 3;
                String sqKey = sqNum + "_" + "S";
                map.putIfAbsent(sqKey, new HashSet<>());
                Set<Character> sqChars = map.get(sqKey);
                if (sqChars.contains(ele)) {
                    return false;
                } else {
                    sqChars.add(ele);
                    map.put(sqKey, sqChars);
                }


            }
        }
        return true;
    }
        
    }

