if [ -z "$VERSION_NAME" ]
then
    echo "APP Center 沒有定義 VERSION_NAME"
    exit
fi

ANDROID_GRADLE_FILE=$APPCENTER_SOURCE_DIRECTORY/app/build.gradle

if [ -e "$ANDROID_GRADLE_FILE" ]
then
    echo "更新 versionName： $VERSION_NAME ($APPCENTER_BUILD_ID) in build.gradle"
    sed -i '' 's/versionName "[0-9.]*"/versionName "'$VERSION_NAME'"/' $ANDROID_GRADLE_FILE

    echo "檔案內容:"
    cat $ANDROID_GRADLE_FILE
fi

