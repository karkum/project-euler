require 'Prime'

def is_good(num) 
  size = num.to_s.length
  for i in (0..size)
    split1 = num.to_s[i, size].to_s
    split2 = num.to_s[0, i].to_s
    if split1.length > 0 and not Prime.prime?(split1.to_i)
      return false
    end
    if split2.length > 0 and not Prime.prime?(split2.to_i)
      return false
    end
  end
  puts num
  return true
end

primes = Prime.take(100000)
#ignore 2,3,5,7
primes = primes[4,100000] 
i = 0
sum = 0
for prime in primes
  if i == 11
    break
  end
  if is_good(prime)
    sum += prime.to_i
    i +=1
  end
end
puts sum
