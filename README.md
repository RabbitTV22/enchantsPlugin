## open source gui plugin for buying enchantement books

# https://modrinth.com/plugin/buybooks/

**Guide to editing the prices of each book**

If you would like to edit prices of the book you can not do it in the config file as there is no config. You will need to edit the code yourself. 

1. Copy the code into your favorite IDEA. I will be using IntelliJ.
  
   ![image](https://github.com/RabbitTV22/enchantsPlugin/assets/154371299/d028a55e-a8cc-4b63-ab3c-6e010f8fff4b)

2. Go to /enchantPlugin/src/main/java/net/rabbitnetwork/buybooks/BuyBooks.java
  
   ![image](https://github.com/RabbitTV22/enchantsPlugin/assets/154371299/8d87597d-4b2f-405a-8396-015e45660f8c)

3. Find the book you want to edit. I will be using Efficiency as an example (yes I know I made a spelling mistake).
  
   ![image](https://github.com/RabbitTV22/enchantsPlugin/assets/154371299/f25f4ece-46f1-46db-929d-4ad49b2d3d54)

4. Edit the text so it matches the price you want. Note this is the text that will show up under the item when you hover on the book.
   
    ![image](https://github.com/RabbitTV22/enchantsPlugin/assets/154371299/1a126ec0-edd6-4e0c-b8cc-d1d919989378)

5. Scroll down again to line 516 and find the book you want edited there
   
    ![image](https://github.com/RabbitTV22/enchantsPlugin/assets/154371299/e321f43e-9406-44d8-8692-cec4c9fd615c)

6. Change the numbers there to match the numbers you set on step 4. The first number is the amount of emeralds and the second is the levels of XP.
   
    ![image](https://github.com/RabbitTV22/enchantsPlugin/assets/154371299/11221977-07b6-4f0a-89ed-648cb05c8a7f)

7. Now head over the the gradlew file and run it.
   
    ![image](https://github.com/RabbitTV22/enchantsPlugin/assets/154371299/a98e73af-e081-4a27-a223-50aa11c80b5f)

8. In the console type ./gradlew build and wait for it to compile
   
    ![image](https://github.com/RabbitTV22/enchantsPlugin/assets/154371299/561de6dd-70e4-4f0c-93ff-d0957ab6e977)

9. Go to /builds/libs/ to grab your plugin jar file.
   
    ![image](https://github.com/RabbitTV22/enchantsPlugin/assets/154371299/fc8af985-4a02-4726-a63d-2891841f9e87)

10. You are done! Just put that jar file in your plugins folder and if you did everything right it should work!
