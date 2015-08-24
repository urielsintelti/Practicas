abcMa="ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
abcMi="abcdefghijklmn�opqrstuvwxyz";
palabra="Ynkxquip Nuqrky, wak ks as vx�si�v�u Jueqk zks�g vxkb�yzu qqgrgx\nYnkxx�sluxj, ky as jkzkiz�bk vx�bgju, gqzu, jkqmgju, lx�u, �xus�iu,\n�smks�uyu k �szkqkizagqrkszk �swa�kzu. Cgzyus qu jkyix�hk l�y�igrkszk\njkq y�ma�kszk ruju gq vuiu jk iusuikxykf";
cont=0;
res=0;
clave=6;
  for( i=0;i<palabra.size();i++)//palabra

  {
      if (palabra.charAt(i) == '.' || palabra.charAt(i) == ',' || palabra.charAt(i) == ' ' || palabra.charAt(i) == '\n') {
          print palabra.charAt(i)
      }
      for (ab = 0; ab < abcMa.length(); ab++)//abcedario
      {
          if (palabra.charAt(i) == abcMa.charAt(ab) || palabra.charAt(i) == abcMi.charAt(ab)) {

              if (ab - clave < 0) {
                  res = (ab - clave);
                  cont = abcMa.length() + res;
              } else {
                  cont = ab - clave;
              }
              if (Character.isUpperCase(palabra.charAt(i))) {
                  print(abcMa.charAt(cont));
              } else {
                  print abcMi.charAt(cont)
              }
              ab = abcMa.length();
          }
      }
  }