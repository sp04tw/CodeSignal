boolean solution(int[] sequence) {
    /*[1, 3, 2, 1] output:false
    [1, 3, 2] out:true
    [1, 2, 1, 2] out:false
    [3, 6, 5, 8, 10, 20, 15] out:false
    [3, 5, 67, 98, 3] out:true*/
    if(sequence.length==2) return true;
    int count=0;
    for(int i=0;i<sequence.length-1;i++){
        if(sequence[i]>=sequence[i+1]){
            boolean leftFlag=i>0 && sequence[i+1]<=sequence[i-1];
            boolean rightFlag=i<sequence.length-2 && sequence[i+2]<=sequence[i];
            count++;
            if(count>1 || leftFlag && rightFlag) return false;
        }
    }
    return true;
}
