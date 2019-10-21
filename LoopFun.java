 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int fact = 1;
          for(int i = 1; 1 <= number; i++){
            fact = fact * i;
        }
            return fact;
        }
    
          
      

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          
          String [] acro = phrase.split(" ");
          for(int i = 0; i < acro.length; i++){
              if(acro[i-1].equals(" ")){
                  
                }
                System.out.println(acro[i]);
            }
            return null;
        }
    
        
          
          
      

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
     String[]replacer= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","a","b","c","d"};
     String[]newWord=word.split("");
     for(int i = 0; i<=newWord.length; i++){
        for(int j = replacer.length; j >=0 ; j--){
            if(newWord[i].equals(replacer[j])){
                newWord[i]=replacer[j+3];
               
                
        
      
    }
    
    
}
    
    
}
return null;
}

}







