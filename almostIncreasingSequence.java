boolean solution(int[] sequence) {
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
