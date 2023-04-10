# Collection of what I have learnt

## isUnique

- String.charAt(index) can be used to get character at index "index" in the string.
- string.length() works with 1 indexing exactly like array.length.
- map.Contains(value) is used to check if something exists into the map. It is generally O(1) tie but can vary depending
on the data.
- map.add(value) is used to put something inside the map.
- There are two different approaches of solving that problem, one using a Hashset and another using boolean array. 
Both have their pros and cons.

### Hashset vs Boolean Array:
- It uses dynamic array, hence less memory usage in case the string contains all the unique characters whereas in 
  case of Boolean array, doesn't matter if the string is unique or not, it will always allocate same space.
- On the other hand, the Boolean array works well since it will always only use 256 character values and the lookup 
  time is constant since we are using indexed, on the other hand, using the hashset might result in non-constant 
  lookup times.
