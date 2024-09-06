# Assignment answers

## a

- assertArrayEquals takes to arrays and a string as a parameters. First array parameter is compared to the second array parameter, last parameter is a String message what is expected from the test result.
- First it checks if the two arrays contain the same number of elements. (or if they are null)
- Then it checks if all the elements are equal to each other.

## b

- The test run fails and it gives "AssertionFailedError".
- Then it tells that the array contents differ at index [x] or lengths differ, saying what was expected, and what was the result.

## c

- First it checks if the two arrays contain the same number of elements. (or if they are null)
- Then it checks if all the elements are equal to each other.
- Then it checks if the elements inside the previously checked elements are also equal to each other.
