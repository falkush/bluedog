# bluedog
Lua Bruteforcer for Majora's Mask Dog Race

# Acknowledgment
Thanks to Vidya James for capturing my interest with this video on the subject: https://www.youtube.com/watch?v=jzE1yygGu-Q

# How to contribute
I am using BizHawk-2.8-win-x64. The SHA-256 hash of the ROM is efb1365b3ae362604514c0f9a1a2d11f5dc8688ba5be660a37debf5e3be43f2b.

I provided the save state I am using in the files. However, please exit and re-enter the track area and create a new save state (at the very last message of Mamamu Yan) to reset the dogs conditions so you do not bruteforce the same races as me.

Unfortunately, Lua doesn't support pixel reading. So I tweaked my autosplitter (https://github.com/falkush/autosplitter) to read the pixels and detect if the blue dog wins. Since the positions of the pixels might differ on your computer, you'll have to use setup.java from the autosplitter repository to create new pixel reading data. The rectangles I used for the four possible end race Mamamu's messages are around the first letter.

# Update
After three days of running the script almost non-stop, 8410 simulations later, the glitch happened and the blue dog finally won! To reproduce the win, use the save state file in the folder "bluedogwin" and run the Lua script with it using BizHawk. It takes a little while before the race starts because it waits for the correct RNG value.

Video of blue dog winning: https://www.youtube.com/watch?v=MXrU5gBagYE

# Update 2
I had the idea that if the dogs with the faster colors had normal/bad conditions and if the dogs with the slower colors had normal/good conditions, blue dog might stand a chance at getting first place. So I made another Lua script to bruteforce their condition (see folder dograceconditions). I was able to quickly find a satisfying set of conditions for the dogs.

After a night of running the script, 1272 simulations later, the blue dog finished second place. This gives me great hope that first place is possible without relying on the glitch. To reproduce the win, use the save state file in the folder "bluedog-second" and run the Lua script with it using BizHawk. It takes a little while before the race starts because it waits for the correct RNG value.

Video of second place: https://youtu.be/prFHTn1aIXw

# Update 3
After observing three second places using the above idea, after around 30k simulations ran on my computer and laptop over five days, a true first place happened. To reproduce the win, use the save state file in the folder "truewin" and run the Lua script with it using BizHawk-2.9.1-win-x64. It takes a little while before the race starts because it waits for the correct RNG value. GG!

True first place: https://youtu.be/H58uYF6IQ24
