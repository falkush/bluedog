# bluedog
Lua Bruteforcer for Majora's Mask Dog Race

# Acknowledgment
Thanks to Vidya James for capturing my interest with this video on the subject: https://www.youtube.com/watch?v=jzE1yygGu-Q

# How to contribute
I am using BizHawk-2.8-win-x64. The SHA-256 hash of the ROM is efb1365b3ae362604514c0f9a1a2d11f5dc8688ba5be660a37debf5e3be43f2b.

I provided the save state I am using in the files. However, please exit and re-enter the track area and create a new save state (at the very last message of Mamamu Yan) to reset the dogs conditions so you do not bruteforce the same races as me.

Unfortunately, Lua doesn't support pixel reading. So I tweaked my autosplitter (https://github.com/falkush/autosplitter) to read the pixels and detect if the blue dog wins. Since the positions of the pixels might differ on your computer, you'll have to use setup.java from the autosplitter repository to create new pixel reading data. The rectangles I used for the four possible end race Mamamu's messages are around the first letter.

# Update
After three days of running the script almost non-stop, 8410 simulations later, the glitch happened and the blue dog finally won! To reproduce the win, use the save state file in the folder "bluedogwin" and run the Lua script with it using BizHawk.
