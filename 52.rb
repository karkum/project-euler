def compare(a, b)
  a_set = a.to_s.chars.map(&:to_i).sort
  b_set = b.to_s.chars.map(&:to_i).sort
  return a_set == b_set
end

x = 1
while true
  twox = 2 * x
  if compare(twox, 3*x)
    if compare(twox, 4*x)
      if compare(twox, 5*x)
	 if compare(twox, 6*x)
	   puts x
	   break
	 end
      end
    end
  end
  x = x + 1
end


