����   4�
  �
  �
 } � � �G,D 
  � 
 
	  		 		

 
 	
 
 
 





  �
 
 
  !" 	# 	$
%&'��      @�      (	 ) 	*+
 ,
 N-
 ./
 0
 12
 34
 N5
 N678
 9:;
 @
 <@       =>?@
 LAB
 NCD
EFG	HI
JKL	HMNOPQ
 [
 ZR
 Z 	S
 NT 	U
 %V
 V
  �
W gXY gZ[
 i �@刀    \@!�TD-
 m]@{�       �D?�      @(      
 m^
 _
 `
 U
 ab InnerClasses SAMPLE_RATE I ConstantValue BYTES_PER_SAMPLE    BITS_PER_SAMPLE    
MAX_16_BIT D SAMPLE_BUFFER_SIZE    MONO    STEREO LITTLE_ENDIAN Z     
BIG_ENDIAN SIGNED UNSIGNED line $Ljavax/sound/sampled/SourceDataLine; buffer [B 
bufferSize <init> ()V Code LineNumberTable LocalVariableTable this 
LStdAudio; init format !Ljavax/sound/sampled/AudioFormat; info Info #Ljavax/sound/sampled/DataLine$Info; e .Ljavax/sound/sampled/LineUnavailableException; StackMapTable getAudioInputStreamFromFile :(Ljava/lang/String;)Ljavax/sound/sampled/AudioInputStream; file Ljava/io/File; is1 Ljava/io/InputStream; is2 Ljava/io/IOException; 3Ljavax/sound/sampled/UnsupportedAudioFileException; filename Ljava/lang/String;cd! close play (D)V sample s S ([D)V i samples [D read (Ljava/lang/String;)[D bytesToRead 	bytesRead ioe data left right ais &Ljavax/sound/sampled/AudioInputStream; audioFormat bytes nB � � � save (Ljava/lang/String;[D)V temp bais Ljava/io/ByteArrayInputStream;@ (Ljava/lang/String;)V stream )(Ljavax/sound/sampled/AudioInputStream;)V count BUFFER_SIZE e loop clip Ljavax/sound/sampled/Clip; note (DDD)[D hz duration 	amplitude a main ([Ljava/lang/String;)V args [Ljava/lang/String; freq steps [I � 
access$000 x0 
access$100 <clinit> 
SourceFile StdAudio.java � � � � � � javax/sound/sampled/AudioFormat StdAudio �fg !javax/sound/sampled/DataLine$Info "javax/sound/sampled/SourceDataLine �hijl � �mn � � ,javax/sound/sampled/LineUnavailableExceptionopqrstu �v � "java/lang/IllegalArgumentException filename is null � � java/io/Filewxyz{|}y~�� java/lang/StringBuilder could not read '�� '�s java/io/IOException �� 1javax/sound/sampled/UnsupportedAudioFileException #file of unsupported audio format: '� �� ���� sample is NaN java/lang/Short � ��� argument to play() is null � ����� PStdAudio.read() currently supports only a sample rate of 44100 Hz
audio format: ���� CStdAudio.read() currently supports only 16-bit audio
audio format: �x WStdAudio.read() currently supports only audio stored using little endian
audio format: �� �� java/lang/IllegalStateException 
read only ��  of   bytes�� &audio format is neither mono or stereo filenameis null samples[] is null java/io/ByteArrayInputStream �� $javax/sound/sampled/AudioInputStream �� .wavd�� .WAV����� .au .AU�� (file type for saving must be .wav or .au unable to save file ' java/lang/Thread 
StdAudio$1 ��m� �� � �� ���m � javax/sound/sampled/Clip �� 
StdAudio$2 java/lang/Math���� � � � � � � java/lang/Object java/io/InputStream java/lang/String java/lang/Throwable (FIIZZ)V javax/sound/sampled/DataLine 5(Ljava/lang/Class;Ljavax/sound/sampled/AudioFormat;)V javax/sound/sampled/AudioSystem getLine� ;(Ljavax/sound/sampled/Line$Info;)Ljavax/sound/sampled/Line; open %(Ljavax/sound/sampled/AudioFormat;I)V java/lang/System out Ljava/io/PrintStream; 
getMessage ()Ljava/lang/String; java/io/PrintStream println start exists ()Z getAudioInputStream 6(Ljava/io/File;)Ljavax/sound/sampled/AudioInputStream; java/lang/Class getResourceAsStream )(Ljava/lang/String;)Ljava/io/InputStream; =(Ljava/io/InputStream;)Ljavax/sound/sampled/AudioInputStream; getClassLoader ()Ljava/lang/ClassLoader; java/lang/ClassLoader append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString *(Ljava/lang/String;Ljava/lang/Throwable;)V drain stop java/lang/Double isNaN (D)Z write ([BII)I 	getFormat #()Ljavax/sound/sampled/AudioFormat; getSampleRate ()F -(Ljava/lang/Object;)Ljava/lang/StringBuilder; getSampleSizeInBits ()I isBigEndian 	available ([B)I (I)Ljava/lang/StringBuilder; getChannels ([B)V :(Ljava/io/InputStream;Ljavax/sound/sampled/AudioFormat;J)V endsWith (Ljava/lang/String;)Z� (javax/sound/sampled/AudioFileFormat$Type Type WAVE *Ljavax/sound/sampled/AudioFileFormat$Type; a(Ljavax/sound/sampled/AudioInputStream;Ljavax/sound/sampled/AudioFileFormat$Type;Ljava/io/File;)I AU (Ljava/lang/Runnable;)V $(Ljavax/sound/sampled/AudioFormat;)V printStackTrace getClip ()Ljavax/sound/sampled/Clip; (I)V sin (D)D pow (DD)D� javax/sound/sampled/Line$Info #javax/sound/sampled/AudioFileFormat javax/sound/sampled/Line 1  }      �  �    s  � �  �    �  � �  �    �  � �  �    /  � �  �    �  � �  �    �  � �  �    �  � �  �    �  � �  �    �  � �  �    �  � �  �    � 
 � �   
 � �   
 � �     � �  �   3     *� �    �   
    K  M �        � �   
 � �  �   �     O� Y� K� Y	*� 
L+� � 	� � *  �  
��� � K� *� � � �  �    8 ;   �   * 
   X  Y  [ $ \ 0 a 8 e ; c < d F h N i �       ) � �     � �  < 
 � �   �    { �
 
 � �  �  �     �*� � Y� �� Y*� L+� � +� �*� M,� ,� �� *� N-� -� �� Y� Y�  !� "*� "#� "� $� �L� Y� Y�  !� "*� "#� "� $+� &�L� Y� Y�  (� "*� "#� "� $+� &�   " f % # 2 f % 3 E f % F f f %  " � ' # 2 � ' 3 E � ' F f � '  �   B    m  n  s  t  u # y * z . { 3  = � A � F � f � g � � � � � �   >   O � �  * < � �  = ) � �  g ! � �  � ! � �    � � �   �   & �  ��  ��  ��   �  �a � 	 � �  �   1      � � ) � � * �    �       �  �  � 	 � �  �   �     x&� +� � Y,� �& -��  -G&�� G /&k��=&�� �=� � 2Y`� 2�T� � 2Y`� 2z�T� 2� �� � � � �� 3 W� 2�    �   .    �  �  � % � - � 7 � F � X � b � s � w � �       x � �   - K � �  �   
 � ? 	 � �  �   w     #*� � Y4� �<*�� *1� 5����    �       �  �  �  � " � �       � �    # � �   �   
 � �  	 � �  �  "    �*� L+� 6M,� 7�� � Y� Y�  8� ",� 9� $� �,� :� � Y� Y�  ;� ",� 9� $� �,� <� � Y� Y�  =� ",� 9� $� �N+� >6�N+-� ?6� .� @Y� Y�  A� "� BC� "� BD� "� $� E�� ':� Y� Y�  !� "*� "#� "� $� &�-�6,� F� El�:6l� .-h`3 �~x-h3 �~��� /oR�����,� F� vl�:6l� _-h`3 �~x-h`3 �~��� /o9-h`3 �~x-h`3 �~��� /o9		c GoR������ @YI� E�  w � � %  �   � !   �  � 
 �  � / � 8 � S � Z � u � w � } � � � � � � � � � � � � � � � � � � � � � �' �- �0 �8 �@ Lp�� ��	 �   �  } > � �  � 2 � �  � " � �  � 4 � �  � : � � p 2 � � �  � � 	C e � � @ k � �   � � �   � � �  
� � �  w> � �  � � � �  �   3 � / � �#!� E �B �#�  �� 3� �  �� d�  	 � �  �      *� � YJ� �+� � YK� �� Y� M+�h�N6+�� <+1 /k��6+1�� �6-h`�T-h`z�T���û LY-� M:� NY,+��� O:*P� Q� *R� Q� � S� Y*� � TW� 3*U� Q� *V� Q� � W� Y*� � TW� � YX� �� ':� Y� Y�  Y� "*� "#� "� $� &��  u � � %  �   ^       ! +" 2# <$ H% V& a' o# u, - �. �/ �1 �2 �5 �: �8 �9; �   \ 	 H ' � �  5 @ � �   e � �  � V � �  � " � �    � �     � �  + � � �  2 � � �  �   ) �  � ��  � � * � �� 	B �# ) � �  �   E     � ZY� [Y*� \� ]� ^�    �      G L M �        � �   
 � �  �  #     �L =*� 6N� Y	-� 
:� � 	L+-� _ +�  �:6*� `Y6� +� 3 W���+� W+� ) +� a � HN-� b+� ?+� ) +� a � 0N-� c+� '+� ) +� a � :+� +� ) +� a ��   S f %  S ~   S �   f k �   ~ � �   � � �    �   v   U V Y Z [  \ '] -^ 2_ 5` Da Sk Wl ]m fd ge kk ol um ~g h �k �l �m �k �l �m �o �p �   \ 	  H � �   < � �  2 ! � �  5  � �  g  � �    � �    � � �    � � �   � � �  �   W � 5  � � � � �  �   � �  R �W �W ��   � �     �  �   � �   ) � �  �   �     E*� � Y� d�*� L� eM,+� f ,� h � M,� c� M,� b� ZY� iY� j� ]� ^�   # &   # . %  �   :   y { ~ � � #� &� '� +� .� /� 3� A� D� �   4    � �  '  � �  /  � �    E � �    4 � �  �    �   � �  �G � 
 � �  �   �  	   ; k(k�6`�:6� ! n�k&k ko� pkR�����    �      � � � � 2� 8� �   >   % � �    ; � �     ; � �    ; � �   3 � �   + � �  �    �  �� $ 	 � �  �  &     � qH>s�  t n'k�k ko� pk� 5�����
YOYOYOYOYOY	OYOYON6-�� * q G-.� vo� xk9 t� y� z���ո {�    �   .   � � � "� (� S� ]� r� ~� �� �� �   >   " � �  r  � �  V . � �    � � �    � � �  S 5 � �  �    � � !� - �� - � �  �   /     *� �    �       3 �        � �   � �  �   /     *� �    �       3 �        � �    � �  �   (      � 2� |�    �       I  Q  R  �    � ~   *  i      [       � � 	k� � 	H�� 	