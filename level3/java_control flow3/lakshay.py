
import pandas as pd 
import numpy as np
'''n1 = np.array([10,20,30,40])
month=['jan','feb','mar','apr']
obj = pd.Series(data=n1,index=(month))
print (n1)
print(obj)
print(obj.index)
print(obj.values)'''

obj2=pd.Series([3.5,5,6.5,8])
obj3=pd.Series([6.5,np.nan,2.34])
print(obj2.shape,obj3.shape)
print(obj2.nbytes)
