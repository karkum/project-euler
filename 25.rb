#imperative
a = 1
b = 1
i = 2
while b.to_s.length < 1000
  oldb = b
  b = a + b
  a = oldb
  i+=1 
end
puts i
