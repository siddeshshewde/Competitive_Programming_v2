function accum(s) {
	var res = '';
	for (var i = 0; i < s.length; i++) {
    	for (var j = 0; j <= i; j++)
	    	j === 0 ? res += s[i].toUpperCase() : res += s[i].toLowerCase();
  		if (i !== s.length - 1) res += '-';
	  }
	return res;
}