# Phase 1

I created a HashMap to store five species names and their population counts. I used a Scanner to let the user enter a species name and check its population. If the species was not found, the program displayed a message explaining that it was not in the registry. A HashMap is useful for this task because each species name is connected to its population, and I can look up a species directly by its name. An array or ArrayList would require me to search through the entries or manage separate positions for names and counts.

# Phase 2

I used a Scanner to read sightings.txt one line at a time. For each species, I checked whether it was already in the HashMap. If it existed, I increased its population by one. If it was new, I added it with a count of one. The most challenging part was making sure the program could find and read the file correctly. I also handled missing files and skipped empty lines to avoid problems.


# Phase 3

I added a loop that goes through every species in the HashMap and compares its population count to the current maximum and minimum. The program keeps track of the species with the highest and lowest counts and prints both results. Looking up one species by its name is usually O(1) on average with a HashMap, while finding the maximum and minimum requires checking every species, which takes O(n) time.
