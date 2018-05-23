

fn main () {

    let mut v =  Vec![111,222,333,444,555];
    let mut i = 0;

    while i<4 {
        print!(v[i]);
        i = i+1;
    }

    let mut v_tri = Vec![v[i],v[i],v[i],v[i]] ;

    i = 0;

    while i<4 {
        while i>0 && v[i]>v_tri[i-1] {
            let mut a = v_tri[i-1];
            v_tri[i-1]=v[i];
            v_tri[i] = a;
        }
        i = i+1;
    }

    while i<4 {
            print!(v_tri[i]);
    }

}

