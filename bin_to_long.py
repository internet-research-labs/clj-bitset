def bin_to_long(string):
  if len(string) != 64: return None

  result = 0

  for i in range(63):
    c = string[63-i]
    if c == '1':
      result += 2**i

  if string[0] == '1':
    result += -2**63

  return result

print bin_to_long('0111111111111111111111111111111111111111111111111111111111111111')
print 9223372036854775807

print bin_to_long('1000000000000000000000000000000000000000000000000000000000000000')
print -9223372036854775808

print


print "thief 1 => ", bin_to_long('1000' * 16)
print "thief 2 => ", bin_to_long('0100' * 16)
print "thief 3 => ", bin_to_long('0010' * 16)
print "thief 4 => ", bin_to_long('0001' * 16)

print map(lambda x: int(x, 2), [ '0001', '1111', '0000', '1100' ]);
print bin_to_long('0001'*16)

print map(lambda x: int(x, 2), [ '1111', '1111', '0000', '0000',
                                 '0000', '0000', '0000', '0000',
                                 '0000', '0000', '0000', '0000',
                                 '0000', '0000', '0000', '0000', ]);
# print bin_to_long('1111' + '1111' + '0'*56)
print bin_to_long('11111111' + '00000000' * 7)
