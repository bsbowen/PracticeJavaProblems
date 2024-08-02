package org.example;

public class JavaExercises {

    //warmup1 sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // If it's not a weekday or they're on vacation, that means they're sleeping in.
        if (!weekday || vacation) {
            return true; // They're sleeping in.
        }

        // Otherwise, they're not sleeping in.
        return false;
    }
    //warmup1 monkeytrouble
    //This method returns true if we're in trouble because both monkeys are either smiling or not smiling.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // If both monkeys are smiling or neither is smiling, we're in trouble
            if (aSmile == bSmile) {
        return true; // Trouble!
       }
        return false; // No trouble

    }
    //warmup1 sumDouble
    public int sumDouble(int a, int b) {
        // Calculate the sum of 'a' and 'b'
        int sum = a + b;

        // If 'a' and 'b' are equal, double the sum
        if (a == b) {
            sum = sum * 2;
        }

        // Return the final result
        return sum;
    }
    //warmup2 stringTimes
    public String stringTimes(String str, int n) {
        // Starting off with an empty string to build up our result
        String result = "";

        // Loop n times to add the string to the result
        for (int i = 0; i < n; i++) {
            result += str; // Adding the string to result in each loop
        }

        // Finally, return the big string we made
        return result;
    }

    //warmup2 frontTimes
    public String frontTimes(String str, int n) {
        int frontLen = 3; // We'll use 3 as the default length for the front part

        // If the string is shorter than 3 characters, adjust the length to the string's length
        if (frontLen > str.length()) {
            frontLen = str.length();
        }

        // Get the front part of the string
        String front = str.substring(0, frontLen);

        // Initialize the result string
        String result = "";

        // Loop n times to append the front part to the result
        for (int i = 0; i < n; i++) {
            result = result + front; // Add the front part to the result each time
        }

        // Return the final result string with n copies of the front part
        return result;
    }

    //string1 helloName
    public String helloName(String name) {
        // Concatenate "Hello " with the provided name and an exclamation mark
        String greeting = "Hello " + name + "!";

        // Return the final greeting string
        return greeting;
    }
    //string1 makeAbba
    public String makeAbba(String a, String b) {
        // Concatenate the strings in the order abba
        String result = a + b + b + a;

        // Return the final result string
        return result;
}
    //string2 doubleChar
    public String doubleChar(String str) {
        // Initialize an empty StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Iterate over each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // Get the current character
            result.append(c).append(c); // Append the character twice
        }

        // Convert StringBuilder to string and return the result
        return result.toString();
    }
    //array1 firstLast6
    public boolean firstLast6(int[] nums) {
        // Check if the first element is 6
        if (nums[0] == 6) {
            return true; // If it is, return true
        }

        // Check if the last element is 6
        if (nums[nums.length - 1] == 6) {
            return true; // If it is, return true
        }

        // If neither the first nor the last element is 6, return false
        return false;
    }
    //array1 sameFirstLast
    public boolean sameFirstLast(int[] nums) {
        // Check if the array length is 1 or more
        if (nums.length >= 1) {
            // Check if the first and last elements are the same
            if (nums[0] == nums[nums.length - 1]) {
                return true; // If they are the same, return true
            }
        }

        // If the array length is less than 1, or first and last elements are not the same, return false
        return false;
    }

    //array2 countEvens
    public int countEvens(int[] nums) {
        int count = 0; // Initialize a counter to keep track of even numbers

        // Iterate over each integer in the input array
        for (int num : nums) {
            if (num % 2 == 0) { // Check if the number is even
                count++; // Increment the counter if the number is even
            }
        }

        // Return the count of even numbers
        return count;
    }

    //map1 mapBully
    public Map<String, String> mapBully(Map<String, String> map) {
            // Retrieve the value of key "a"
            String valueOfA = map.get("a");

            // Check if key "a" has a value
            if (valueOfA != null && !valueOfA.isEmpty()) {
                // Set key "b" to the value of key "a"
                map.put("b", valueOfA);

                // Set key "a" to an empty string
                map.put("a", "");
            }

            // Return the modified map
            return map;
        }

    //map2 word0
    public Map<String, Integer> word0(String[] strings) {
        // Create a new HashMap to store the result
        Map<String, Integer> map = new HashMap<>();

        // Iterate through each string in the input array
        for (String s : strings) {
            // Put the string into the map with the value 0
            map.put(s, 0);
        }

        // Return the populated map
        return map;
    }
    //logic1 cigarParty
    public boolean cigarParty(int cigars, boolean isWeekend) {
            // If it's the weekend, there is no upper limit on cigars
            if (isWeekend) {
                return cigars >= 40; // Party is successful if cigars are 40 or more
            } else {
                // During weekdays, cigars must be between 40 and 60 inclusive
                return cigars >= 40 && cigars <= 60; // Party is successful if within the range
            }
        }

    //logic2 makeBricks
    public boolean makeBricks(int small, int big, int goal) {
            // Calculate the maximum number of big bricks we can use without exceeding the goal
            int maxBigBricks = goal / 5;

            // Use the smaller number between available big bricks and the calculated max
            int usedBigBricks = Math.min(big, maxBigBricks);

            // Calculate the remaining inches needed after using the big bricks
            int remainingGoal = goal - (usedBigBricks * 5);

            // Check if we have enough small bricks to cover the remaining goal
            return remainingGoal <= small;
        }










}





































































































































}
