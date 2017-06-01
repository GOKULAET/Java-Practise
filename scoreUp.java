public int scoreUp(String[] key, String[] answers) {
int score=0;
for(int i=0;i<key.length;i++){
if(!answers[i].equals("?") && !answers[i].equals(key[i]))
score-=1;
else if(answers[i].equals(key[i]))
score+=4;
}
return score; 
}


//Another Method

public int scoreUp(String[] key, String[] answers) {
int marks=0,minus=0;
for(int i=0;i<key.length;i++)
{if(answers[i].equals("?"))
continue;
if(key[i].equals(answers[i]))
marks+=4;
else
minus++;
}
return marks-minus;
}
