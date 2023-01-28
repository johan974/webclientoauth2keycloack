# Purpose
- This project demonstrates the 'client-credentials' Oauth2 type.

# Security type: Application access
In some cases, applications may need an access token to act on behalf of themselves rather than a user. For example, the service may provide a way for the application to update their own information such as their website URL or icon, or they may wish to get statistics about the users of the app. In this case, applications need a way to get an access token for their own account, outside the context of any specific user. OAuth provides the client_credentials grant type for this purpose.

To use the client credentials grant type, make a POST request like the following:

```
POST https://api.authorization-server.com/token
  grant_type=client_credentials&
  client_id=CLIENT_ID&
  client_secret=CLIENT_SECRET
```

The response will include an access token in the same format as the other grant types.
