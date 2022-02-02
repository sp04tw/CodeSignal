int solution(String number){
  //number="456" out:3
  //number="6666" out:10
  //number="303" out:5
  //divisble by 3
  int count = 0;
  for (int i = 0; i < number.length; i++){
    int n = 0;
    for (int j = i; j < number.length; j++){
      n = n * 10 + (number.charAt(j) - '0');
      if (n % 3 == 0 && n!=0) count++;
     }
   }
   return count;
}
