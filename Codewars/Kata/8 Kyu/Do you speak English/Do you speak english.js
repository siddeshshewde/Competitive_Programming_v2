function spEng(sentence){

sentence=sentence.toLowerCase();
//if(sentence.indexOf("english") > -1)
if(sentence.match(/english.*/))
  return true;
  
else 
  return false;
}