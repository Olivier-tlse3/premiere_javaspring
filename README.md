 javaspring:
 
J'ai utilisé mysql command line client

```bash
CREATE USER 'username'@'localhost' IDENTIFIED BY 'password';

GRANT ALL PRIVILEGES ON javaspring_test.* TO 'username'@'localhost';

FLUSH PRIVILEGES;
```
