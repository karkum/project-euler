names = File.read("fixture_files/names.txt").delete('"').split(',').sort
total = 0
names.each_with_index do |name, index|
  score = name.chars.map{|c| c.ord - 64}.reduce(:+)
  total += (index + 1) * score
end
puts total

