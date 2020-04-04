def main(s):
    if s == "forward": 
        return forward() 
    elif s == "backward": 
        return backward() 
    else: 
        return "Not a valid input."