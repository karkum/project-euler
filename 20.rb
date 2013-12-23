class Integer
  def fact
    (1..self).reduce(:*) || 1
  end
end

puts (100.fact).to_s.each_char.reduce(0){|x,y| x.to_i + y.to_i}

