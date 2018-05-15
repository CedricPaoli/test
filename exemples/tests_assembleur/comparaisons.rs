fn main()
 {
    //==
    if 123456 == 223456
    {
        print !(1);
    }
    else if 56 == 123456
    {
        print !(2);
    }
    else if 56 == 72
    {
        print !(3);
    }
    else if 72 == 72
    {
        if 1234567 == 1234567
        {
            print !(7);
        }
        else 
        {
            print !(4);
        } 
    }
    
    //!=
    if 2234567 != 2234567
    {
        print !(1);
    }
    else if 56 != 56
    {
        print !(2);
    }
    else if 56 != 72
    {
        if 223456 != 123456
        {
            if 223456 != 56
            {
                print !(7);
            }
            else
            {
                print !(5);
            }
        }
        else 
        {
            print !(4);
        } 
    }
    
    
    //>=
    if 123456 >= 223456
    {
        print !(1);
    }
    else if 56 >= 223456
    {
        print !(2);
    }
    else if 56 >= 72
    {
        print !(3);
    }
    else if 56 >= 56
    {
        if 223456 >= 56
        {
            if 223456 >= 123456
            {
                if 223456 >= 23
                {
                    print !(7);
                }
                else 
                {
                    print !(6);
                } 
            }
            else 
            {
                print !(5);
            } 
        }
        else 
        {
            print !(4);
        } 
    }
    
    
    //>
    if 123456 > 223456
    {
        print !(1);
    }
    else if 56 > 223456
    {
        print !(2);
    }
    else if 56 > 72
    {
        print !(3);
    }
    else if 72 > 56
    {
        if 223456 > 56
        {
            if 223456 > 123456
            {
                if 223456 > 23
                {
                    print !(7);
                }
                else 
                {
                    print !(6);
                } 
            }
            else 
            {
                print !(5);
            } 
        }
        else 
        {
            print !(4);
        } 
    }
    
    //<=
    if 223456 <= 123456
    {
        print !(1);
    }
    else if 223456 <= 56
    {
        print !(2);
    }
    else if 72 <= 56
    {
        print !(3);
    }
    else if 56 <= 56
    {
        if 56 <= 223456
        {
            if 123456 <= 223456
            {
                if 23 <= 223456
                {
                    print !(7);
                }
                else 
                {
                    print !(6);
                } 
            }
            else 
            {
                print !(5);
            } 
        }
        else 
        {
            print !(4);
        }
    }
    
    
    //<
    if 223456 < 123456
    {
        print !(1);
    }
    else if 223456 < 56
    {
        print !(2);
    }
    else if 72 < 56
    {
        print !(3);
    }
    else if 56 < 72
    {
        if 56 < 223456
        {
            if 123456 < 223456
            {
                if 23 < 223456
                {
                    print !(7);
                }
                else 
                {
                    print !(6);
                } 
            }
            else 
            {
                print !(5);
            } 
        }
        else 
        {
            print !(4);
        } 
    }
}
