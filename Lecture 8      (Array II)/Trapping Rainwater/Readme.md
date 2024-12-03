# Iss question ka logic aisa hai jo bahut jagah use hota hai, aur interview me isse question pucha jata hai but jaruri nhi hai question isi name se pucha jaye means like Trapped Rainwater isko puch sakta hai like Trapped Acid and many more.


Isko question ko solve karne ke liye kuch steps hai : 
~ Step 1 : First find the left maximum boundary   (calculate left max boundary - auxialries array)
~ Step 2 : Then find the right maximum boundary,   (calculate right max boundary - auxilaries array)
~ Step 3 : Then take minimum of both and subtract height from the Minimum   (water level = min(left max boundary , right max boundary)
~ Step 4 : Then the difference is the Trapped Water   (trapped water = water level - height[i])


# There are some points are that is :
1. Array must have more than two heights(building)    means (arr.length > 2);
2. Element of array should not sort in Ascending or Decending order