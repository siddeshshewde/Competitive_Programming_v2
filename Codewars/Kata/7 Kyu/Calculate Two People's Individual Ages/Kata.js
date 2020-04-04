function getAges(sum,difference){
   if (difference<0||sum<0) return null;
   sum=sum/2
   difference/=2
   if (sum+difference<0||sum-difference<0) return null;
   return [sum+difference,sum-difference]
};