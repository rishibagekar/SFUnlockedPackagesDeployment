- name: Fetch Apex Test Classes
        id: find-test-classes
        run: |
          find force-app/main/default/classes -name '*Test.cls' -type f | xargs -n 1 basename | sed 's/.cls//' > test_classes.txt

 
 - name: Setup Github CLI
        run: echo "${{ secrets.GH_TOKEN }}" | gh auth login --with-token

- name: Setup Github CLI
        run: echo "${{ secrets.GH_TOKEN }}" | gh auth login --with-token

      - name: Get latest merged PR
        id: get_pr
        env:
          GH_TOKEN: ${{ github.token }}
        run: |
          LATEST_PR=$(gh pr list $PR_NUMBER --repo ${{ github.repository }} --state merged --limit 1 --json number --jq '.[0].number')
          echo "LATEST_PR=$LATEST_PR" >> $GITHUB_ENV
      - name: Fetch PR details
        env:
          GH_TOKEN: ${{ github.token }}
        run: |
          PR_NUMBER=${{ env.LATEST_PR }}
          PR_DETAILS=$(gh pr view $PR_NUMBER --repo ${{ github.repository }} --json number,title,author,changedFiles,createdAt,mergedAt,body,url)
          echo "PR_DETAILS=$PR_DETAILS" >> $GITHUB_ENV
      - name: Store new Pull Request details
        run: |
          Version_Id=${{ env.new_version_id }}
          echo -e "\nMerged PR details: ${{ env.PR_DETAILS }}\nPackage Details: name:PackageTest Subscriber Version Id: $Version_Id" >> CHANGELOG.md
          git config user.name "release[bot]"
          git config user.email "<>"
          git add CHANGELOG.md
          git commit -m "Updating change log file"
          git push
