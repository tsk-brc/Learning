require './app/mission_c_095.rb'

describe '認証チェック' do
  describe '出力結果のテスト' do
    let(:missionC095) { MissionC095.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "abc\n", "bac\n"
      expect($stdout).to receive(:puts).with('YES')
      missionC095.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "abc\n", "abc\n"
      expect($stdout).to receive(:puts).with('NO')
      missionC095.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets).and_return "abc\n", "xy\n"
      expect($stdout).to receive(:puts).with('NO')
      missionC095.run
    end
  end
end
