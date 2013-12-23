puts (2**1000).to_s.each_char.reduce(0){|x,y| x.to_i + y.to_i}
