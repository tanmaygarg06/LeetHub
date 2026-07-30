bool isPalindrome(int x) {
    int ori=x;
    int a;
    long long int rev=0;
    while(x>0){
        a=x%10;
        x=x/10;
        rev=(rev*10)+a;
    }
    if(rev==ori){
        return true;
    }
    else{
        return false;
    }
}