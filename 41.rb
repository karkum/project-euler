require 'Prime'
puts (1..9).flat_map.each{ |i| 
  ('1'..i.to_s).to_a.permutation.map{|n| n.join('').to_i}.select{|k| Prime.prime?(k)}
}.max
