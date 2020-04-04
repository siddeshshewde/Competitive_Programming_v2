function passed (list) { 
    var solution = 0, pass = 0;
    for (var i = 0 ; i < list.length ; i++)
    {
        if (list[i] < 19)
        {
            solution = solution + list[i];
            pass++;
        }
    }
    if (pass == 0)
        return "No pass scores registered.";
    return Math.round(solution/pass);

} 