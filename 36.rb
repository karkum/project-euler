#!/usr/bin/ruby
sum = 0;
for i in 1..1_000_000
  if i.to_s(2) == i.to_s(2).reverse && i.to_s == i.to_s.reverse then
    sum = sum + i
  end
end
puts sum
