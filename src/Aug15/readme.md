# WHAT IS DIFF between @Component and @ Repository ? [interview]

# MetaData [detials of data]

# RESPONSE ENTITY [we set both header for incoming request and outgoing response] [R.E used to set customised header ]#
1. value = "College-Market" --- incoming request header
2. "Market" ---- outgoing response header


# CASCADE TYPE [if you dont type cascade,then child will not update ] [this is JPA FUNCTION ]
1. ALL []
2. PERSIST [SAVE CHILD AND PARENT BOTH @SAME TIME ]
3. MERGE [UPDATE CHILD AND PARENT BOTH @SAME TIME ]
4. REMOVE [DELETE CHILD AND PARENT BOTH @SAME TIME ]
5. REFRESH []
6. DETACH [DETACH CHILD FROM PARENT ]