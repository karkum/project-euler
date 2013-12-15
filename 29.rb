#functional
puts (2..100).to_a.product((2..100).to_a).map {|i,j| i**j}.uniq!.count

#Imperative
set = []
for i in 2..100 
  for j in 2..100
    set << i**j
  end
end
puts set.uniq!.count
