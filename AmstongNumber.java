����   @ W  loopsprogram/AmstongNumber  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lloopsprogram/AmstongNumber; main ([Ljava/lang/String;)V
     startExcution args [Ljava/lang/String;	    java/lang/System   out Ljava/io/PrintStream;  Enter your Number:
     java/io/PrintStream ! " println (Ljava/lang/String;)V $ java/util/Scanner	  & ' ( in Ljava/io/InputStream;
 # *  + (Ljava/io/InputStream;)V
 # - . / nextInt ()I
  1 ! 2 (I)V 4 It's Amstrong Number 6 It's not Amstrong Number 8 Do you want to continue y/n:
 # : ; < next ()Ljava/lang/String;
  > ? " 
printValue sc Ljava/util/Scanner; number I sum num i a s Ljava/lang/String; StackMapTable L y
 N P O java/lang/String Q R equals (Ljava/lang/Object;)Z T Thanks 
SourceFile AmstongNumber.java !               /     *� �    
                    	       2      � �    
   
    	  
             
      =     t� � � #Y� %� )K*� ,<=>6� 
p6hh`=
l<���� � 0� � 3� � � 5� � 7� *� 9:� =�    
   N               "  (  3  8  A  H  M  U ! X $ ` & h ' n ( s )    H   a @ A    \ B C   Z D C   X E C   " F C  (  G C  n  H I  J    � "  #  �  
 ? "     \     *K� M� 	� � � S� �    
       - 	 /  1  4  7         H I   J      U    V